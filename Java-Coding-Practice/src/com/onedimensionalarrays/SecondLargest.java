package com.onedimensionalarrays;


import java.util.*;
class SecondLargest {
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
     for(int num : arr)
     {
         if(num>f)
         {
             s=f;
             f=num;
         }
         else if(num>s && num!=f)
         {
             s=num;
         }
     }
     System.out.println("Second Largest Element is :"+s);
 }
}
