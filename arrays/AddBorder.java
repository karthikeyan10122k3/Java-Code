package com.kar.practice.exercise.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddBorder {
    public static void main(String[] args) {
        String[] picture = {"abc",
                            "ded"};

        System.out.println(Arrays.toString(solution(picture)));
//        solution(picture);
    }

    private static String[] solution(String[] picture) {

        StringBuilder stars = new StringBuilder();
        for (int i =0; i< picture.length;i++) {
            picture[i] = "*" + picture[i] + "*";
        }
        stars.append("*".repeat(picture[0].length()));
        ArrayList<String> resultArray = new ArrayList<>(List.of(picture));
        resultArray.add(0, String.valueOf(stars));
        resultArray.add(String.valueOf(stars));

        return resultArray.toArray(new String[0]);
    }
}
