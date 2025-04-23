package com.pramod.algorithm.graph.undirectedGraph;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyMatrix {
    private boolean adjMatrix[][];
    private int numVertices;

    // Initialize the matrix
    public AdjacencyMatrix(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new boolean[numVertices][numVertices];
    }
    // Get adjacent vertices of a given vertex v
    public List<Integer> adj(int v) {
        List<Integer> neighbors = new ArrayList<>();

        for (int i = 0; i < numVertices; i++) {
            if (adjMatrix[v][i]) {
                neighbors.add(i);
            }
        }
        return neighbors;

    }

    // Add edges
    public void addEdge(int i, int j) {
        adjMatrix[i][j] = true;
        adjMatrix[j][i] = true;
    }

    // Remove edges
    public void removeEdge(int i, int j) {
        adjMatrix[i][j] = false;
        adjMatrix[j][i] = false;
    }


    public int degree(int vertices) {
        int degree = 0;
        for (int i = 0; i < vertices; i++) {
            // If there's an edge from v to i, add to degree.
            // For self loops, count twice.
            if (adjMatrix[vertices][i]) {
                degree++;
            }
        }
        return degree;
    }
    // Print the matrix
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numVertices; i++) {
            s.append(i + ": ");
            for (boolean j : adjMatrix[i]) {
                s.append((j ? 1 : 0) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }

}
