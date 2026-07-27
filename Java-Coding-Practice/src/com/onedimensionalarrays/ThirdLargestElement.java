package com.onedimensionalarrays;


import java.util.*;
class ThirdLargestElement {
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n =sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++)
     {
         arr[i]=sc.nextInt();
     }
     int f=Integer.MIN_VALUE;
     int s=Integer.MIN_VALUE;
     int t=Integer.MIN_VALUE;
     
     for(int num : arr)
     {
         if(num>f)
         {
        	 t=s;
             s=f;
             f=num;
         }
         else if(num>s && num!=f)
         {
        	 t=s;
             s=num;
         }
         else if(num>t && num!=s && num!=f)
         {
        	 t=num;
         }
     }
     System.out.println("Third Largest Element is :"+t);
 }
}