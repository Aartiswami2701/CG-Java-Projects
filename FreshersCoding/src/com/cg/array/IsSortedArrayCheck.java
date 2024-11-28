package com.cg.array;

//Write a function that checks if an array is sorted in ascending order.

import java.util.ArrayList;


/*public class ArrayEg6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {6,7,5,4,2,8};
		int f=0;
		for(int i=0;i<arr1.length-1;i++)
		{
			if(arr1[i]<=arr1[i+1])
			{
				f=1;
			}
			else
			{
				f=0;
				break;
			}
		}
		if(f==1)
			{
				System.out.println("Sorted");
			}
			else

			{
				System.out.println("not sorted");
			}
	}

}*/

//using collection
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IsSortedArrayCheck {

    public static boolean isSorted(Integer[] nums) {
        List<Integer> list = Arrays.asList(nums);
        
        List<Integer> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        
        return list.equals(sortedList);
    }

    public static void main(String[] args) {
        Integer[] nums1 = {1, 2, 3, 4, 5}; 
        Integer[] nums2 = {5, 3, 4, 1, 2}; 
        
        System.out.println("Is nums1 sorted? " + isSorted(nums1)); 
        System.out.println("Is nums2 sorted? " + isSorted(nums2)); 
    }
}

