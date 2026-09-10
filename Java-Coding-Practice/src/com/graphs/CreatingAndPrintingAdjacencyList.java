package com.graphs;

import java.util.Scanner;
import java.util.ArrayList;

public class CreatingAndPrintingAdjacencyList {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of Vertices : ");
		int vertices = sc.nextInt();
		
		System.out.println("Enter the number of Edges : ");
		int edges = sc.nextInt();
		
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
			System.out.print(i+"->");
			for(int neg : graph.get(i))
			{
				System.out.print(neg+" ");
			}
			System.out.println();
		}
		

		sc.close();
		
	}

}
