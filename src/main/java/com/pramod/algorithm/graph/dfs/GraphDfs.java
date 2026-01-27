    package com.pramod.algorithm.graph.dfs;

import com.pramod.algorithm.graph.undirectedGraph.AdjacencyList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GraphDfs {


    public List<Integer> dfsOfGraphUsingStack(int V,
                                    AdjacencyList adj) {

        Boolean[] visited = new Boolean[V];
        Arrays.fill(visited, false);
        List<Integer> result = new ArrayList<>();

        return result;

    }


    public List<Integer> dfsOfGraph(int V,
                                    AdjacencyList adj) {

        Boolean[] visited = new Boolean[V];
        Arrays.fill(visited, false);
        List<Integer> result = new ArrayList<>();

        dfsOfGraph(0, adj, visited, result);
        return result;

    }


    public void dfsOfGraph(int v,
                           AdjacencyList adj, Boolean[] visited, List<Integer> result) {
        visited[v] = true;
        result.add(v);
        for (int i : adj.adj(v)) {
            if (!visited[i]) {
                dfsOfGraph(i, adj, visited, result);
            }

        }

    }
}
