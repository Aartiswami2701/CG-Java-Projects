package com.cg.FileIOHandling;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		File f= new File("writeFile3.txt");
		
		try {
			fis= new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//bufferedinputestream connect with file input stream
		
		bis=new BufferedInputStream(fis);
		try {
			while(bis.available()>0) {
			try {
				System.out.println((char)bis.read());
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				bis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
