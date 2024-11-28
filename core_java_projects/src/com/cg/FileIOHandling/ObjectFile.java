package com.cg.FileIOHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.io.ObjectOutputStream;

import com.cg.pack.Emp;

public class ObjectFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1[]emp= new Employee1[4];
		emp[0]= new Employee1(1, "aarti");
		emp[1]= new Employee1(2, "shbm");
		emp[2]= new Employee1(3, "soum");
		
		 FileOutputStream fos=null;
		 ObjectOutputStream obs=null;
		 
		try {
			fos = new FileOutputStream("emp.txt");
			obs= new ObjectOutputStream(fos);
			obs.writeObject(emp);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				obs.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//read file
		 Employee1[] emp1 = null;
	        try (FileInputStream fis = new FileInputStream("emp.txt");
	             ObjectInputStream ois = new ObjectInputStream(fis)) {
	            emp1 = (Employee1[]) ois.readObject();
	            System.out.println("Employees read from the file:");
	            for (Employee1 employee : emp1) {
	                System.out.println("Data:"+ employee);
	            }
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
		
					
				
		}
	}
