package com.day01.coderepo;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

public class CodeRepoCleanerService {

    private static final Pattern BAD_METHOD_PATTERN =
            Pattern.compile("public void [A-Z].*\\(");

    private Map<FileStatus, List<Path>> fileMap =
            new HashMap<>();

    public CodeRepoCleanerService() {
        for (FileStatus status : FileStatus.values()) {
            fileMap.put(status, new ArrayList<>());
        }
    }

    public void scanFolder(String folderPath) {

        try {
            Files.walk(Paths.get(folderPath))
                    .filter(p -> p.toString().endsWith(".java"))
                    .forEach(this::analyzeFile);
        } catch (IOException e) {
            System.out.println("Scan error.");
        }
    }

    private void analyzeFile(Path path) {

        try {
            String content =
                    new String(Files.readAllBytes(path));

            if (BAD_METHOD_PATTERN.matcher(content).find()) {
                fileMap.get(FileStatus.WARNING).add(path);
            } else {
                fileMap.get(FileStatus.VALID).add(path);
            }

        } catch (IOException e) {
            fileMap.get(FileStatus.ERROR).add(path);
        }
    }

    public void displayReport() {

        fileMap.forEach((status, files) -> {
            System.out.println("\n" + status);
            files.forEach(System.out::println);
        });
    }
}