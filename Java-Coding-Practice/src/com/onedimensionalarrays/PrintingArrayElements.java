/*
 * Program: Printing Array Elements
 * Topic: One-Dimensional Arrays
 * Description: Demonstrates declaration, initialization,
 * input, and printing of array elements.
 */

package com.onedimensionalarrays;

import java.util.Scanner;

public class PrintingArrayElements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num of elements : ");
		int n =sc.nextInt(); // Read the size of the array from the user
		
		System.out.println("Enter the elements of the array : ");
		int arr[]=new int[n];
		//Taking input from user
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)  //Display all the elements of array
		{
			System.out.println("Element at index "+i+" : "+arr[i]);
		}
		
		sc.close();//closing scanner object
		
	}

}
