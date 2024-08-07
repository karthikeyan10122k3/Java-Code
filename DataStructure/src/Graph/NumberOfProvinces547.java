package com.kar.practice.exercise.DataStructure.src.Graph;

public class NumberOfProvinces547 {
    public static void main(String[] args) {
        int[][] edges = {{1,1,0},{1,1,0},{0,0,1}};
        System.out.println(findCircleNum(edges));
    }

    public static int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int noOfProvinces = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                noOfProvinces++;
                dfs(i, isConnected, visited);
            }
        }

        return noOfProvinces;
    }

    private static void dfs(int node, int[][] isConnected, boolean[] visited) {
        visited[node] = true;
        for (int i = 0; i < isConnected.length; i++) {
            if (isConnected[node][i] == 1 && !visited[i]) {
                dfs(i, isConnected, visited);
            }
        }
    }
}
