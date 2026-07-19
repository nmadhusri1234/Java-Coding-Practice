/* 
 * Program: Transpose of a Matrix
 * Topic: Multidimensional Arrays
 * Description: Demonstrates declaration, initialization,
 * input, transpose, and display of a matrix.
 */

package com.multidimensionalarrays;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		//Read the dimensions of the matrix
		System.out.println("Enter number of rows and columns :");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		//Declare the original matrix and its transpose
		int matrix[][]=new int[rows][cols];
		int transpose[][]=new int[cols][rows];
		
		//Read the elements of the original matrix
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		
		//Generating transpose by interchanging rows and columns
		for(int i=0;i<cols;i++)
		{
			for(int j=0;j<rows;j++)
			{
				transpose[i][j]=matrix[j][i];
			}
		}
		
		//Display the transpose matrix
		System.out.println("Matrix after Transpose : ");
		for(int i=0;i<cols;i++)
		{
			for(int j=0;j<rows;j++)
			{
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
		
		//close the scanner object
		sc.close();
	}

}
