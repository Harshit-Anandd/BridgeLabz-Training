package com.day01.resume;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class ResumeAnalyzerService {

    private Map<String, ResumeData> resumeMap = new HashMap<>();
    private List<ResumeData> sortedCandidates = new ArrayList<>();

    public void readResumes(String folderPath) {

        try {
            Files.walk(Paths.get(folderPath))
                    .filter(Files::isRegularFile)
                    .forEach(path -> processFile(path.toFile()));

            sortedCandidates.addAll(resumeMap.values());
            sortedCandidates.sort(
                    Comparator.comparingInt(r -> -r.matchCount));

        } catch (IOException e) {
            System.out.println("Folder read error.");
        }
    }

    private void processFile(File file) {
        try {
            String content =
                    new String(Files.readAllBytes(file.toPath()));
            ResumeData data = ResumeParser.parse(content);
            resumeMap.put(data.email, data);
        } catch (Exception e) {
            System.out.println("Skipping invalid resume: " + file.getName());
        }
    }

    public void displayCandidates() {
        sortedCandidates.forEach(System.out::println);
    }
}