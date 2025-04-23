package com.pramod.algorithm.graph.undirectedGraph;

public class GraphAdjacencyMatrixTesting {
    AdjacencyMatrix adjMatrix = new AdjacencyMatrix(4);
    public static void main(String args[]) {
        GraphAdjacencyMatrixTesting g = new GraphAdjacencyMatrixTesting();
        g.adjMatrix.addEdge(0, 1);
        g.adjMatrix.addEdge(0, 2);
        g. adjMatrix.addEdge( 1, 2);
        g.adjMatrix.addEdge(2, 3);


        System.out.println(  g.adjMatrix.adj(2));

        System.out.print(g.toString());
    }
}
