package com.salesforce.gryffindor;

import java.io.*;

public class ReadingFileTryWithResources {
	public static void main(String[] args) {
		File file = new File("/Users/danno/sample.txt");
		try (FileReader fileReader = new FileReader(file);
		     BufferedReader bufferedReader = new BufferedReader(fileReader)) {
			
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
