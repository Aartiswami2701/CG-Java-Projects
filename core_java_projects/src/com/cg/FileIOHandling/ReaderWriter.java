package com.cg.FileIOHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw= null;
	try {
		fw= new FileWriter("write.txt");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		fw.write("hi .. happy to see you..");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 
	FileReader fr=null;
	try {
		fr= new FileReader("write.txt");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		int i;
		while((i=fr.read())!=-1) {
			System.out.println((char)i);
		}
		//(char)fr.read();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

}
