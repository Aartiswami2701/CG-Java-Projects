package com.cg.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ReadNIO {

	public static void main(String[] args) {
		String appendcont="This is append Method";
		// TODO Auto-generated method stub
		String path="data.txt";
		try {
			String str=Files.readString(Paths.get(path));
			
			Files.writeString(Paths.get(path), appendcont, StandardOpenOption.APPEND);
			String str1=Files.readString(Paths.get(path));
			System.out.println(str);
			System.out.println("Appended "+str1);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
