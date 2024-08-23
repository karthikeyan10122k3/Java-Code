package com.kar.practice.exercise.DataStructure.src.Graph.TopoSort;

import java.util.*;

public class CourseScheduleII210 {

    public static int[] findOrder(int numCourses, int[][] prerequisites) {

        List<List<Integer>> adjList = new ArrayList<>();
        int[] inDegree = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int pre = prerequisite[1];
            adjList.get(pre).add(course);
            inDegree[course]++;
        }
        System.out.println(Arrays.toString(inDegree));

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }
        System.out.println(queue);

        int index = 0;
        int[] order = new int[numCourses];
        while (!queue.isEmpty()) {
            int course = queue.poll();
            order[index++] = course;
            for (int neighbor : adjList.get(course)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        return index == numCourses ?order : new int[]{};

    }

    public static void main(String[] args) {
        int[][] prerequisites = {
                {1, 0},
                {2, 0},
                {3, 1},
                {3, 2}
        };

        System.out.println(Arrays.toString(findOrder(prerequisites.length, prerequisites)));
    }
}
