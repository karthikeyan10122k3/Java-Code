package com.kar.practice.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradingStudentInMultiplesOfFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> grades = new ArrayList<>();

        System.out.print("Enter the number of grades: ");
        int numGrades = sc.nextInt();

        for (int i = 0; i < numGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            int grade = sc.nextInt();
            grades.add(grade);
        }

        List<Integer> roundedGrades = gradingStudents(grades);

        System.out.println("Processed Grades:");
        for (int roundedGrade : roundedGrades) {
            System.out.println(roundedGrade);
        }
    }
    public static List<Integer> gradingStudents(List<Integer> grades) {
        for(int i=0;i<grades.size();i++){
            int studentGrade = grades.get(i);
            int reminder = studentGrade%5 ;
            if(studentGrade >=38 && reminder>2){
                studentGrade =studentGrade- reminder+5;
                grades.set(i,studentGrade);
            }
        }
        return grades;

    }
}
