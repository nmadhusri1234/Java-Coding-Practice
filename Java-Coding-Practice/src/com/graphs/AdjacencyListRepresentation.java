package com.graphs;

import java.util.ArrayList;
public class AdjacencyListRepresentation {

	static void addEdge(ArrayList<ArrayList<Integer>> graph,int u,int v)
	{
		graph.get(u).add(v);
		graph.get(v).add(u);
	}
	
	static void printGraph(ArrayList<ArrayList<Integer>> graph)
	{
		for(int i=0;i<graph.size();i++)
		{
			System.out.print(i+"->");
			for(int neighbor : graph.get(i))
			{
				System.out.print(neighbor+" ");
			}
			System.out.println();
		}
	}

	
	public static void main(String[] args) {
		
		int vertices=5;
		
		//create adjacency list
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		
		//initialize each vertex with an empty list
		for(int i=0;i<vertices;i++)
		{
			graph.add(new ArrayList<>());
		}
		addEdge(graph,0,1);
		addEdge(graph,1,0);
		addEdge(graph,1,3);
		addEdge(graph,2,4);
		
		printGraph(graph);
	}

}
