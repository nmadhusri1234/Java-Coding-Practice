package com.strings;

public class StringOccurances {

	public static void main(String[] args) {
		
		String str = "Hello";
		
		char ch[] = str.toCharArray();
		
		int res[] = new int[ch.length];
		
		for(int i=0;i<ch.length;i++)
		{
			if(res[i]==-1)  //we have make it -1 when visited before so after the iteration it must be skipped
			{
				continue;
			}
			for(int j=i;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					res[i]++;
					
					if(i!=j) //skipping duplicates
					{
						res[j]=-1;
					}
				}
				
			
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			if(res[i]!=-1)
			System.out.println(ch[i]+" "+res[i]);
		}

	}

}
