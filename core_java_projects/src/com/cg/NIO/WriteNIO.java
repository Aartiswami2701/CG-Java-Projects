package com.cg.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteNIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hi Aarti";
		String path="data.txt";
		try {
			Files.writeString(Paths.get(path), str);
			System.out.println("written to file.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
