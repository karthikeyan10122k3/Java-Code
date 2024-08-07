package com.kar.practice.exercise.DataStructure.src.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleInGraphBFS {
    static class Pair {
        int node;
        int parent;

        public Pair(int node, int parent) {
            this.node = node;
            this.parent = parent;
        }
    }

    private static boolean detectCycleBFS(int[][] matrix) {
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

        for (int start = 0; start < V; start++) {
            if (!visited[start]) {
                Queue<Pair> queue = new LinkedList<>();
                queue.offer(new Pair(start, -1));
                visited[start] = true;

                while (!queue.isEmpty()) {
                    Pair current = queue.poll();
                    int currNode = current.node;
                    int parent = current.parent;

                    for (Integer neighbor : adjLs.get(currNode)) {
                        if (!visited[neighbor]) {
                            visited[neighbor] = true;
                            queue.offer(new Pair(neighbor, currNode));
                        } else if (neighbor != parent) {
                            return true;
                        }
                    }
                }
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
        System.out.println(detectCycleBFS(matrix));
    }
}
