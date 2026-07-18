/*  Program: Subtraction of Two Matrices
 * Topic: Multidimensional Arrays
 * Description: Demonstrates declaration, initialization,
 * input, subtraction, and display of two matrices using
 * the brute-force and optimized approaches.
 */

package com.multidimensionalarrays;

import java.util.Scanner;

public class SubtractionOfTwoMatrices {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter num of rows : ");
		int rows = sc.nextInt();
		System.out.print("Enter num of columns : ");
		int cols = sc.nextInt();
		
		int[] matrix1[]=new int[rows][cols];
		
		/* int[] matrix2[]=new int[rows][cols];
		int sub[][]=new int[rows][cols];
		
		System.out.println("Enter elements of matrix1 : ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				matrix1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter elements of matrix2 : ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				matrix2[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				sub[i][j]=matrix1[i][j]-matrix2[i][j];
			}
		}
		
		
		System.out.println("Subtraction of 2 matrices : ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(sub[i][j]+" ");
			}
			System.out.println();
		}*/
		
		
		System.out.println("Enter elements of matrix1 : ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				matrix1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter elements of matrix2 : ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
			// Read each element of Matrix 2 and subtract it from Matrix 1
				matrix1[i][j]-=sc.nextInt();
				
			}
		}
		
		System.out.println("Difference of 2 matrices : ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
