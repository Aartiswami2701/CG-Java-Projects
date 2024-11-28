package com.cg.sorting;

public class charBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		charBubbleSort cb = new charBubbleSort(); 
        char arr[] = { 'c','b','z','a' ,'A'}; 
        cb.sort(arr); 
        System.out.println("Sorted array"); 
        cb.print(arr); 

	}
	public void sort(char[] arr) 
    { 
        int array = arr.length; 
        for(int i=0;i<array-1;i++) {
        	for(int j=0;j<array-i-1;j++) 
        	{
        		if(arr[j]>arr[j+1]) 
        		{
        			char temp= arr[j];
        			arr[j]=arr[j+1];
        			arr[j+1]=temp;					
        		}
        	}
        }
	}

	public void print(char[] arr) {
		 char n = (char) arr.length; 
	        for (int i = 0; i < n; ++i) 
	            System.out.print(arr[i] + " "); 
	        System.out.println(); 
	}

}
