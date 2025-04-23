package com.pramod.algorithm.graph.undirectedGraph;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyList {
    private int vertices;
    private List<List<Integer>> adjList;
    public AdjacencyList(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>();

        // Initialize each list in the adjacency list
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int dest){
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }

    // Get degree of vertex v
    public int degree(int v) {
        return adjList.get(v).size();
    }

    public List<Integer> adj(int v) {
        return adjList.get(v);
    }



}
