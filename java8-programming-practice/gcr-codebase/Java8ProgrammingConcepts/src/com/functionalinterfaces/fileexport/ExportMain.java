package com.functionalinterfaces.fileexport;
public class ExportMain {

	public static void main(String[] args) {

		Exporter exporter = new CSVExporter();

		exporter.exportCSV();     // Existing functionality
		exporter.exportToJSON();  // Newly added default method
	}
}
