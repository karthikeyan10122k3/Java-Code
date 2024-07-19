package com.kar.practice.exercise.strings.src;

import java.util.ArrayList;
import java.util.HashMap;

public class ZigzagConversion6 {
    public static void main(String[] args) {
        String s = "AB";
        int numRows = 1;
        System.out.println(convert(s,numRows));
    }
    public static String convert(String s, int numRows) {
        if (numRows == 1){
            return s;
        }
        HashMap<Integer, ArrayList<Character>> map = new HashMap<>();
        boolean decreaseRow = false;
        int row = 1;
        for (char ch : s.toCharArray()) {
            if (map.containsKey(row)) {
                map.get(row).add(ch);
            } else {
                ArrayList<Character> charList = new ArrayList<>();
                charList.add(ch);
                map.put(row, charList);
            }
            if (!decreaseRow){
                row++;
            }else {
                row--;
            }
            if (!decreaseRow && row == numRows){
                decreaseRow = true;
            }else if (row == 1){
                decreaseRow = false;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int r = 1; r <= numRows; r++) {
            if (map.containsKey(r)) {
                for (char ch : map.get(r)) {
                    System.out.println(ch);
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }
}
