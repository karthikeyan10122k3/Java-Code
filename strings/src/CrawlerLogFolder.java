package com.kar.practice.exercise.strings.src;

public class CrawlerLogFolder {
    public static void main(String[] args) {
        String[] logs = {"d1/","d2/","./","d3/","../","d31/"};
        System.out.println(minOperations(logs));
    }
    public static int minOperations(String[] logs) {
        int operation = 0;
        for (String log: logs){
            if (log.charAt(0) !='.'){
                operation++;
            } else if (log.equals("../")) {
                operation = (operation !=0) ? operation - 1 : 0;
            }
        }
        return operation;
    }
}
