package com.graphs;

import java.util.ArrayList;

public class DFSDisconnectedGraph {
	
	
	
	public static void dfs(ArrayList<ArrayList<Integer>> graph,int vertex,boolean vis[])
	{
		vis[vertex]=true;
		
		System.out.print(vertex+" ");
	    
		for(int neg : graph.get(vertex))
		{
			if(!vis[neg])
			{
				dfs(graph,neg,vis);
			}
		}
			
	}
	

	public static void main(String[] args) {
			
			int vertices = 6;
			boolean vis[]=new boolean[6];
			
			ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
			
			for(int i=0;i<vertices;i++)
			{
				graph.add(new ArrayList<>());
			}
			
			graph.get(0).add(1);
			graph.get(1).add(0);
			graph.get(2).add(3);
			graph.get(3).add(2);
			graph.get(1).add(4);
			graph.get(4).add(5);
			graph.get(5).add(4);
			
			for(int i=0;i<graph.size();i++)
			{
				System.out.print(i+"->");
				for(int neg : graph.get(i))
				{
					System.out.print(neg);
				}
				System.out.println();
			}
			
			System.out.println("DFS Traversal : ");
			
			for(int i=0;i<vertices;i++)
			{
			if(!vis[i])
			dfs(graph,i,vis);
			}
			

}
}