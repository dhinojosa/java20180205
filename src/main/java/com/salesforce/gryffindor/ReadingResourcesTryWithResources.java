package com.salesforce.gryffindor;

import java.io.*;

public class ReadingResourcesTryWithResources {

	public void foo() {
		getClass(); //getClassInfo in an instance method
	}
	public static void main(String[] args) {
		InputStream inputStream = ReadingResourcesTryWithResources.class
				.getResourceAsStream
				("/dbconfig.properties");

		try (InputStreamReader fileReader = new InputStreamReader(inputStream);
		     BufferedReader bufferedReader = new BufferedReader(fileReader)) {
			bufferedReader.lines().forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
