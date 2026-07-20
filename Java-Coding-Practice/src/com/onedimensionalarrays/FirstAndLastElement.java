package com.onedimensionalarrays;

import java.util.Scanner;

public class FirstAndLastElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// Read the size of the array from the user
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();

		// Declare and create an array of size n
		int[] arr = new int[n];
		
		// Read array elements 
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("First Element: "+arr[0]); //to Print first element
		System.out.println("Last Element: "+arr[n-1]); //to print last element

	}

}
