package com.onedimensionalarrays;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int arr[]= {4,7,8,1};
		
		int left = 0;
		int right=arr.length-1;
		
		while(left<right)
		{
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		for(int i=0;i<arr.length;i++)
		{
       System.out.print(arr[i]+" ");
		}
	}

}
