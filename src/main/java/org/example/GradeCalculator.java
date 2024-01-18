package org.example;


import java.util.Scanner;


public class GradeCalculator {
    public static void main(String[] args) {
        // Creating a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of subjects
        System.out.println("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        //Create an array to store 5 Student objects
        Student[] students = new Student[5];

        // Get scores for each subject
        int totalScore = 0;
        for (int i = 0; i < numberOfSubjects; i++) {
            // Ask the user for the score of each subject
            System.out.println("Enter the score for subject " + (i + 1) + ": ");
            int score = scanner.nextInt();
            totalScore += score; // Add the score to the total

        }

        // Calculate the average score
        double averageScore = (double) totalScore / numberOfSubjects;
        System.out.println("The average score is: " + averageScore);

        // Determine the letter grade based on the average score
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
    }
}