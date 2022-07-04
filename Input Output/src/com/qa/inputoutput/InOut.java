package com.qa.inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class InOut {
	public static void writeFile(String a) {
		try {
			FileOutputStream outputStream = new FileOutputStream(
					"C:\\Users\\hodan\\eclipse-workspace\\Input Output\\src\\Output.txt");
			byte b[] = a.getBytes();
			outputStream.write(b);
			outputStream.flush();
			outputStream.close();

			System.out.println("Success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void readFile() {
		try {
			FileInputStream inputStream = new FileInputStream(
					"C:\\Users\\hodan\\eclipse-workspace\\Input Output\\src\\Output.txt");
			int i;
			while ((i = inputStream.read()) != -1) {
				System.out.println((char) i);
			}
			inputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
