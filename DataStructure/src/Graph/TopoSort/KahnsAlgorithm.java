package com.kar.practice.exercise.DataStructure.src.Graph.TopoSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class KahnsAlgorithm {
    private static int[] kahnsAlgoSort(int V, ArrayList<ArrayList<Integer>> adjList) {
        int[] inDegree = new int[V];
        int[] sorted = new int[V];

        for (ArrayList<Integer> integers : adjList) {
            for (Integer currNode : integers) {
                inDegree[currNode] += 1;
            }
        }
        System.out.println(Arrays.toString(inDegree));

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (inDegree[i] == 0){
                queue.offer(i);
            }
        }
        int index = 0;
        while (!queue.isEmpty()){
            int currNode = queue.poll();
            sorted[index++] = currNode;

            for (Integer it:adjList.get(currNode)) {
                inDegree[it] -= 1;
                if (inDegree[it] == 0){
                    queue.offer(it);
                }
            }
        }
        // Check if there was a cycle in the graph
        if (index != V) {
            System.out.println("Cycle detected: Topological sort not possible.");
            return new int[0];
        }

        return sorted;
    }


    public static void main(String[] args) {
        int[][] adjMatrix = {
                {0, 0, 0, 0},
                {1, 0, 0, 0},
                {1, 0, 0, 0},
                {1, 0, 0, 0}
        };

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < adjMatrix.length; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < adjMatrix.length; i++) {
            for (int j = 0; j < adjMatrix[i].length; j++) {
                if (adjMatrix[i][j] == 1 && i != j) {
                    adjList.get(i).add(j);
                }
            }
        }
        System.out.println(adjList);

        System.out.println(Arrays.toString(kahnsAlgoSort(adjMatrix.length, adjList)));
    }


}
