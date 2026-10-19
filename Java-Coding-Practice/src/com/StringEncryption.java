package com;

public class StringEncryption {

	public static void main(String[] args) {
		
		String str = "aaabbcdee";
		int count=1;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<=str.length()-2;i++)
		{
			
			if(str.charAt(i)==str.charAt(i+1))
			{
				count++;
			}
			else
			{
				sb.append(str.charAt(i)+""+count);
				count=1;
			}
		}
		
		System.out.println(sb+""+str.charAt(str.length()-1)+""+count);
	}

}
