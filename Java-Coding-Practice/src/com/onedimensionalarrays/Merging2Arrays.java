package com.onedimensionalarrays;

import java.util.Scanner;

public class Merging2Arrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of first arr :");
		int n1 = sc.nextInt();
		
		System.out.println("Enter length of second arr :");
		int n2 = sc.nextInt();
		
		int arr1[] = new int[n1];
		int arr2[] = new int[n2];
		int arr3[] = new int[n1+n2];
		
		for(int i=0;i<n1;i++)
		{
			arr1[i]=sc.nextInt();
			arr3[i]=arr1[i];
		}
		for(int i=0;i<n2;i++)
		{
			arr2[i]=sc.nextInt();
			arr3[n1+i]=arr2[i];
			
		}
		
		for(int i=0;i<(n1+n2);i++)
		{
			System.out.print(arr3[i]+" ");
		}
		

	}

}
