package com.kar.practice.exercise.DataStructure.src.Graph;

import java.util.ArrayList;


public class DetectCycleInGraphDFS {


    private static boolean detectCycleDFS(int[][] matrix) {
        int V = matrix.length;
        ArrayList<ArrayList<Integer>> adjLs = new ArrayList<>(V);

        for (int i = 0; i < V; i++) {
            adjLs.add(new ArrayList<>());
        }

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1 && i != j) {
                    adjLs.get(i).add(j);
                }
            }
        }
        boolean[] visited = new boolean[V];
        for (int node = 0; node < V; node++) {
            if(!visited[node]){
                if(dfs(node,-1,adjLs,visited)){
                    return true;
                }
            }
        }
        return false;

    }

    private static boolean dfs(int node, int parent,ArrayList<ArrayList<Integer>> adjLs, boolean[] visited) {
        visited[node] = true;

        for (Integer adj: adjLs.get(node)){
            if (!visited[adj]){
                if (dfs(adj,node,adjLs,visited)){
                    return true;
                }
            }else if(adj != parent){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 0, 0},
                {1, 0, 1, 1},
                {0, 1, 0, 1},
                {0, 1, 1, 0}
        };
        System.out.println(detectCycleDFS(matrix));
    }


}
