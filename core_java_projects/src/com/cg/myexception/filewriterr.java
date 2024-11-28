package com.cg.myexception;
import java.io.FileWriter;

import java.io.IOException;
public class filewriterr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filepath= "output.txt";
		try (FileWriter w=new FileWriter(filepath)){
			w.write("hii aarti");
			w.write("\n"+"capgemini...");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("File written successfully...");

	}

}
