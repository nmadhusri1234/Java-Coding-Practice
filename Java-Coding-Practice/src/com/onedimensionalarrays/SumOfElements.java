/*
 * Program: Sum of Array Elements
 * Topic: One-Dimensional Arrays
 * Description: Demonstrates declaration, initialization
 * using user input, calculation of the sum and display
 * of the result.
 */

package com.onedimensionalarrays;

import java.util.Scanner;

public class SumOfElements {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num of elements : ");
		int n =sc.nextInt(); // Read the size of the array from the user
		
		System.out.println("Enter the elements of the array : ");
		int arr[]=new int[n];
		int sum=0; //variable to add the elements
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt(); //read input
			sum+=arr[i]; //calculate sum
		}
		
		//Display sum
		System.out.println("Sum of all the elements in the array : "+sum);
	
		
		sc.close();//closing scanner object

	}

}
