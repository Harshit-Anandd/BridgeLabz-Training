package com.functionalinterfaces.fileexport;

//Existing implementation
public class CSVExporter implements Exporter {

	@Override
	public void exportCSV() {
		System.out.println("Report exported in CSV format.");
	}
}
