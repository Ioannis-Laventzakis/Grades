package org.example;


import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for number of subjects
        System.out.println("Enter the number of subject: ");
        int numberOfSubjects = scanner.nextInt();

        //Get scores for each subject
        int totalScore = 0;
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.println("Enter the score for subject " + (i + 1) + ": ");
            int score = scanner.nextInt();
            totalScore += score;

        }
        //Calculate the average score
        double averageScore = totalScore / numberOfSubjects;
        System.out.println("The average score is: " + averageScore);

        //Determining letter grade
        char letterGrade = ' ';
        if (averageScore >= 90) {
            letterGrade = 'A';
        } else if (averageScore >= 80) {
            letterGrade = 'B';
        } else if (averageScore >= 70) {
            letterGrade = 'C';
        } else if (averageScore >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
        System.out.println("The letter grade is: " + letterGrade);

}}
