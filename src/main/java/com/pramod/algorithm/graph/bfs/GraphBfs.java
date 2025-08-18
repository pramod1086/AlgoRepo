package com.pramod.algorithm.graph.bfs;

import com.pramod.algorithm.graph.undirectedGraph.AdjacencyList;

import java.util.*;

public class GraphBfs {
    static void bfs(AdjacencyList adj, int V, int start) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] =true;

        queue.offer(start);
        while(!queue.isEmpty()){
           int head =  queue.poll();
            System.out.print(head + " ");

            List<Integer>  ls =  adj.adj(head);
            for(Integer l:ls){
                if(!visited[l]){

                    visited[l]= true;
                    queue.add(l);
                }
            }
        }

    }

    public static void main(String[] args) {
        int V = 5;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(1, 2)));
        adj.add(new ArrayList<>(Arrays.asList(0, 2, 3)));
        adj.add(new ArrayList<>(Arrays.asList(0, 4)));
        adj.add(new ArrayList<>(Arrays.asList(1,4)));
        adj.add(new ArrayList<>(Arrays.asList(2,3)));


       bfss(adj,V,1);

        AdjacencyList ls = new AdjacencyList(V);
        ls.addEdge(0,2);
      //  ls.addEdge(1,3);
    //    ls.addEdge(2,0);
        ls.addEdge(2,4);
        ls.addEdge(3,1);
      //  ls.addEdge(4,2);
        // Undirected graph

//        bfs(ls, V, 0); // Output: 0 1 2 3 4
    }

    private static void bfss(ArrayList<ArrayList<Integer>> adj,int V,int start) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] =true;

        queue.offer(start);
        while(!queue.isEmpty()){
            int head =  queue.poll();
            System.out.print(head + " ");

            List<Integer>  ls =  adj.get(start);
            for(Integer l:ls){
                if(!visited[l]){
                    queue.add(l);
                    visited[l]= true;
                }
            }
        }
    }

}
