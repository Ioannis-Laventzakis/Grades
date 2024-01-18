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
}