package com.cg.sorting;

public class NameSelectionSort {

    public static void main(String[] args) {
        NameSelectionSort ss = new NameSelectionSort();
        String arr[] = {"manshree", "aditi", "aarti"};
        System.out.println("Before sorting:");
        ss.print(arr);
        ss.selection(arr);
        System.out.println("After sorting:");
        ss.print(arr);
    }

    public void selection(String arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                // Compare using compareTo method correctly
                if (arr[j].compareTo(arr[min]) < 0) {
                    min = j;
                }
            }
            // Swap the found minimum element with the first element
            String temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public void print(String arr[]) {
        for (String sc : arr) {
            System.out.println(sc);
        }
    }
}
