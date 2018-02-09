package com.salesforce.gryffindor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class ReadingResourcesTryWithResources {

	public static void main(String[] args) {

		Logger logger = LoggerFactory.getLogger
				(ReadingResourcesTryWithResources.class);
		logger.debug("Creating input stream");
		InputStream inputStream = ReadingResourcesTryWithResources.class
				.getResourceAsStream
				("/dbconfig.properties");
		logger.debug("Done creating input stream");

		try (InputStreamReader fileReader = new InputStreamReader(inputStream);
		     BufferedReader bufferedReader = new BufferedReader(fileReader)) {
			bufferedReader.lines().forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
