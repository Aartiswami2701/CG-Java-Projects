package com.cg.myexception;

public class myexception {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int[] arr= {10,20,30};
			
			String str1=null;
			int x=5/1;
			System.out.println(arr[1]);
			System.out.println(str1.length());
		}/*catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array error"+e.getMessage());
		}catch(NullPointerException e1) {
			System.out.println("string length"+e1.getMessage());
		}catch(Exception e2) {
			System.out.println("arithmetic exception"+e2.getMessage());
		}*/
		catch(ArrayIndexOutOfBoundsException | NullPointerException | ArithmeticException e) {
			
			System.out.println("Error occured = "+e.getMessage());
		}	
		finally {
			System.out.println("finally block");
		}
		System.out.println("hii");
	}

}
