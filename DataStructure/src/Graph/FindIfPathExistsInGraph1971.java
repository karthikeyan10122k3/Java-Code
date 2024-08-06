package com.kar.practice.exercise.DataStructure.src.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FindIfPathExistsInGraph1971 {
    public static void main(String[] args) {
        int n = 3;
        int[][] edges = {{0,1},{1,2},{2,0}};
        int source = 0;
        int destination = 2;

        System.out.println(validPath(n,edges,source,destination));

    }
    public static boolean validPath(int n, int[][] edges, int source, int destination) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            list.get(u).add(v);
            list.get(v).add(u);
        }

        System.out.println(list);
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);
        visited[source] = true;

        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int currNode = queue.poll();
                if (currNode == destination){
                    return true;
                }
                for (Integer node: list.get(currNode)){
                    if (!visited[node]){
                        visited[node] = true;
                        queue.offer(node);
                    }
                }
            }
        }
        return false;

    }


}
