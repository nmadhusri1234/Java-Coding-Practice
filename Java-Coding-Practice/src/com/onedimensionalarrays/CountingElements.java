/*
 * Program: Counting Elements in an Array
 * Topic: One-Dimensional Arrays
 * Description: Demonstrates declaration, initialization,
 * input, and finding the number of elements in an array
 * using the length property.
 */

package com.onedimensionalarrays;

import java.util.Scanner;

public class CountingElements {

	public static void main(String[] args) {
	

        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num of elements : ");
		int n =sc.nextInt(); // Read the size of the array from the user
		
		
		System.out.println("Enter the elements of the array : ");
		int arr[]=new int[n];
		
		//Read array elements from user
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		System.out.println("Number of elements in the array: " + arr.length);
		
		sc.close();//close the scanner object
		
	}

}
