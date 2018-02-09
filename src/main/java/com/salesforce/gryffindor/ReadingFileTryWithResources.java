package com.salesforce.gryffindor;

import java.io.*;

public class ReadingFileTryWithResources {
	public static void main(String[] args) {
		File file = new File("/Users/danno/sample.txt");
		try (FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader)) {
			bufferedReader.lines().forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
