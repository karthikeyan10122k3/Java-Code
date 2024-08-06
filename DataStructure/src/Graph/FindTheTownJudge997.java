package com.kar.practice.exercise.DataStructure.src.Graph;

public class FindTheTownJudge997 {
    public static void main(String[] args) {
        int[][] trust = {{1,3},{2,3}};
        int n = 3;
        System.out.println(findJudge(n,trust));

    }
    public static int findJudge(int n, int[][] trust) {
        int[] inDegree = new int[n + 1];
        int[] outDegree = new int[n + 1];

        for(int[] p: trust){
            int out = p[0];
            int in = p[1];
            inDegree[in] +=1;
            outDegree[out] +=1;
        }
        for(int i = 1; i<=n; i++){
            if(inDegree[i] == n-1 && outDegree[i] == 0){
                return i;
            }
        }
        return -1;
    }
}
