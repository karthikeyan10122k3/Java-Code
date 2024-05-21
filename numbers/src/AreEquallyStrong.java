package com.kar.practice.exercise.numbers.src;

public class AreEquallyStrong {
    public static void main(String[] args) {
        int yourLeft = 15;
        int yourRight = 10;
        int friendsLeft = 15;
        int friendsRight = 9;

        System.out.println(solution(yourLeft,yourRight,friendsLeft,friendsRight));
    }

    private static boolean solution(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {

        return (Math.max(yourLeft, yourRight) == Math.max(friendsLeft, friendsRight)) && (Math.min(yourLeft, yourRight) == Math.min(friendsLeft, friendsRight));
    }
}
