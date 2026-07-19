/*
 * Program: Average of Array Elements
 * Topic: One-Dimensional Arrays
 * Description: Demonstrates array declaration, creation,
 * initialization using user input, calculation of the
 * average of array elements, and display of the result.
 */

package com.onedimensionalarrays;

import java.util.Scanner;

public class AverageOfElements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Read the size of the array from the user
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();

		// Declare and create an array of size n
		int[] arr = new int[n];

		int sum = 0; // Variable to store the sum of array elements

		// Read array elements and calculate their sum
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}

		// Calculate the average of the array elements
		double average = (double) sum / arr.length;

		// Display the average
		System.out.println("Average of all the elements in the array: " + average);

		// Close the Scanner object
		sc.close();
	}
}