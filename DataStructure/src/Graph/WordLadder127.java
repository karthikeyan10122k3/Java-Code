package com.kar.practice.exercise.DataStructure.src.Graph;

import java.util.*;

public class WordLadder127 {

    static class Pair{
        StringBuilder word;
        int move;
        public Pair(StringBuilder word, int move){
            this.move = move;
            this.word = word;
        }
    }

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (beginWord.equals(endWord)){
            return 0;
        }
        if (!(wordList.contains(endWord))){
            return 0;
        }
        HashSet<String> wordListSet = new HashSet<>(wordList);
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(new StringBuilder(beginWord), 1));

            while (!queue.isEmpty()){
                Pair p = queue.poll();
                StringBuilder begWrd = new StringBuilder(p.word);

                int moves = p.move;
                for (int index = 0; index < begWrd.length(); index++) {
                    char orgChar = begWrd.charAt(index);
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        if (ch == orgChar) continue;
                        begWrd.setCharAt(index,ch);

                        if (begWrd.toString().equals(endWord)){
                            return moves + 1;
                        }
                        if (wordListSet.contains(begWrd.toString())){
                            queue.offer(new Pair(new StringBuilder(begWrd), moves + 1));
                            wordListSet.remove(begWrd.toString());
                        }
                    }
                    begWrd.setCharAt(index,orgChar);
                }
            }
            return 0;
    }
    public static void main(String[] args) {
        String beginWord = "hit", endWord = "cog";
        ArrayList<String> wordList =new ArrayList<>(Arrays.asList("hot","dot","dog","lot","log"));

        System.out.print(ladderLength(beginWord,endWord,wordList));

    }
}
