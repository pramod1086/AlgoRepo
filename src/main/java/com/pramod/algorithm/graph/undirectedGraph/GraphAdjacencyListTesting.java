package com.pramod.algorithm.graph.undirectedGraph;

public class GraphAdjacencyListTesting {

    public static void main(String[] args) {
        AdjacencyList graph = new AdjacencyList(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        System.out.println("Neighbors of vertex 0: " + graph.adj(0));
        System.out.println("Degree of vertex 0: " + graph.degree(0));

        System.out.println("Neighbors of vertex 1: " + graph.adj(1));
        System.out.println("Degree of vertex 1: " + graph.degree(1));
    }
}
