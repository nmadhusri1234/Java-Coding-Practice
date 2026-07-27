package com.graphs;
import java.util.*;

public class BFS {
	
	public static void bfs(ArrayList<ArrayList<Integer>> graph,int vertex,boolean vis[])
	{
		
		Queue<Integer> q = new LinkedList<>();
		 
		vis[vertex]=true;
		q.offer(vertex);
		
		while(!q.isEmpty())
		{
			int current = q.poll();
			System.out.print(current+" ");
			
		
		for(int neg : graph.get(current))
		{
			if(!vis[neg])
			{
				vis[neg]=true;
				q.offer(neg);
				
			}
		}
		
		}
	}
	

	public static void main(String[] args) {
		
		int vertices=5;
		
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		
		boolean vis[]=new boolean[vertices];
		
		for(int i=0;i<vertices;i++)
		{
			graph.add(new ArrayList<>());
		}
		
		graph.get(1).add(0);
		graph.get(0).add(1);
		
		graph.get(1).add(2);
		
		graph.get(2).add(3);
		graph.get(3).add(2);
		
		graph.get(4).add(3);
		graph.get(3).add(4);
		
		for(int i=0;i<vertices;i++)
		{
			System.out.print(i+"->");
			for(int neg:graph.get(i))
			{
				System.out.print(neg+" ");
			}
			System.out.println();
		}
		
		bfs(graph,0,vis);
		
	}

}
