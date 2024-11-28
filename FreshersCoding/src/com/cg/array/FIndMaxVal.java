package com.cg.array;
//Find the Maximum Element
import java.util.Arrays;

public class FIndMaxVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,5,7,99,6,77,88,990,34};
		int max=arr[0];
		/*for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		System.out.println("maximum element :"+max);*/
		
		
		//max element
		Arrays.sort(arr);
		System.out.println("max element : "+arr[arr.length-1]);
		
		//min element
		Arrays.sort(arr);
		System.out.println("min element : "+arr[0]);
	}

}
