package com.kar.practice.exercise.DataStructure.src.Graph;

public class FindCenterOfStarGraph1791 {

    public static void main(String[] args) {
        int[][] edges = {{1, 2},{2, 3},{4, 2}};
        System.out.println(findCenter(edges));
    }

    public static int findCenter(int[][] edges) {
        int nodes = edges.length + 1;
        int[] inDegree = new int[nodes + 1];

        for(int[] edge: edges){
            int in = edge[0];
            int out = edge[1];
            inDegree[in]++;
            inDegree[out]++;
        }
        for(int i=1; i <= nodes; i++){
            if(inDegree[i] == nodes - 1){
                return i;
            }
        }
        return -1;
    }
}
