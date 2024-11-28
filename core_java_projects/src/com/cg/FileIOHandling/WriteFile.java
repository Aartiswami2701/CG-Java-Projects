package com.cg.FileIOHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos =null;
		String str= "Aarti is good.";
		File f=new File("writeFile3.txt");
		
		//require try catch bcz file may be exists or may not be
		 try {
			fos= new FileOutputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 if(!f.exists()) {
			 try {
				f.createNewFile();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("error in file writing ");
			}
		 }
		//convert set of character into byte array
		 byte[] b= str.getBytes(); 
		 try {
			 System.out.println("file created");
			fos.write(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //write all contents to file(push)
		 try {
			fos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fos!=null)
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}


