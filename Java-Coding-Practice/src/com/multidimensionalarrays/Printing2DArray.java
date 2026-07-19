/*
 * Program: Printing a Two-Dimensional Array
 * Topic: Two-Dimensional Arrays
 * Description: Demonstrates declaration, initialization,
 * and display of a two-dimensional array.
 */

package com.multidimensionalarrays;

public class Printing2DArray {

	public static void main(String[] args) {
		
		int arr[][]= {{2,3,8},
				      {4,5,7}}; //declare and initialize 2d array
	
		System.out.println("Elements of 2D Array are : ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Printing array elements using Enhanced For Loop : ");
		for(int row[]:arr)
		{
			for(int num : row)
			{
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
	}

}
