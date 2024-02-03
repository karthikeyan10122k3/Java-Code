package com.kar.practice.exercise.strings.src;

public class EndswithSameString {
    public static void main(String[] args) {
        System.out.println(solution("karthikeyan", "yan"));
        System.out.println(solution("sreeram", "k"));
        System.out.println(solution("vidya Sagar", "r"));
        System.out.println(solution("Afshith", "ta"));

    }
    public static boolean solution(String string,String ending){

        return string.endsWith(ending);
    }
}
