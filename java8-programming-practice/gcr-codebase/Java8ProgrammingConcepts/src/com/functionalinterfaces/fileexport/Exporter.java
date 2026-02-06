package com.functionalinterfaces.fileexport;

//Interface for exporting reports
public interface Exporter {

	// Abstract method to export CSV
	void exportCSV();

	// Default method added later for JSON export
	default void exportToJSON() {
		System.out.println("Exporting report to JSON format...");
	}
}
