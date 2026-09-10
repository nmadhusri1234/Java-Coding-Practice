package com.graphs;

import java.util.*;

public class NoOfConnectedComponents {

	public static void dfs(ArrayList<ArrayList<Integer>> graph,int vertex,boolean vis[])
	{
		vis[vertex]=true;
		
		//System.out.print(vertex+" ");
	    
		for(int neg : graph.get(vertex))
		{
			if(!vis[neg])
			{
				dfs(graph,neg,vis);
			}
		}
			
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of Vertices : ");
		int vertices = sc.nextInt();
		
		System.out.println("Enter the number of Edges : ");
		int edges = sc.nextInt();
		
		boolean vis[]=new boolean[vertices];
		int count=0;
		
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		
		for(int i=0;i<vertices;i++)
		{
			graph.add(new ArrayList<>());
		}
		for(int i=0;i<edges;i++)
		{
			int u = sc.nextInt();
			int v = sc.nextInt();
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		
		for(int i=0;i<vertices;i++)
		{
		if(!vis[i])
		{
		dfs(graph,i,vis);
		count++;
		}
		}
		
		System.out.println("No of Connected Components :"+count);


	}

}
