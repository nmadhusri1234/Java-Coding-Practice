package com.multidimensionalarrays;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter number of rows and columns :");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int matrix[][]=new int[rows][cols];
		int transpose[][]=new int[cols][rows];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<cols;i++)
		{
			for(int j=0;j<rows;j++)
			{
				transpose[i][j]=matrix[j][i];
			}
		}
		
		System.out.println("Matrix after Transpose : ");
		for(int i=0;i<cols;i++)
		{
			for(int j=0;j<rows;j++)
			{
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
