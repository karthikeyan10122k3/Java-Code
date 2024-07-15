package com.kar.practice.exercise.strings.src;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

public class ReverseSubstringsBetweenEachPairOfParentheses {
    public static void main(String[] args) {
        String s = "(ed(et(oc))el)";

        System.out.println(reverseParentheses(s));
    }

    public static String reverseParentheses(String s) {
        Deque<String> reverseQueue = new LinkedList<>();
        StringBuilder finalReversedString = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                StringBuilder toReverseString = new StringBuilder();
                while (!Objects.equals(reverseQueue.peek(), "(")) {
                    String tempCh = reverseQueue.pop();
                    toReverseString.append(tempCh);
                }
                reverseQueue.pop();
                for (int j = 0; j <toReverseString.length() ; j++) {
                    reverseQueue.push(String.valueOf(toReverseString.charAt(j)));
                }
            } else {
                reverseQueue.addFirst(String.valueOf(s.charAt(i)));
            }
        }
        while (reverseQueue.peekLast() != null) {
            finalReversedString.append(reverseQueue.pollLast());
        }
        return finalReversedString.toString();
    }
}
