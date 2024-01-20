package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.println("Enter the number of subjects: "); // Prompt user for input
        int numberOfSubjects = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                numberOfSubjects = scanner.nextInt(); // Read user input
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number."); // Handle invalid input
                scanner.nextLine();
            } finally {
                if (!validInput) {
                    System.out.println("Please enter a number."); // Prompt user for input
                }
            }
        }

        Student[] students = new Student[numberOfSubjects]; // Create an array of Student objects

        for (int i = 0; i < numberOfSubjects; i++) {     // Loop through the array
            System.out.println("Enter data for Student " + (i + 1));  // Prompt user for input

            System.out.print("Enter student ID: "); // Prompt user for input
            int studentId = scanner.nextInt();
            System.out.print("Enter student name: ");    // Prompt user for input
            String studentName = scanner.next();

            students[i] = new Student(studentId, studentName, numberOfSubjects); // Create a new Student object

            for (int j = 0; j < numberOfSubjects; j++) { // Loop through the array
                System.out.print("Enter the score for subject " + (j + 1) + ": "); // Prompt user for input
                int score = scanner.nextInt();
                students[i].setSubjectScore(j, score);
            }
        }

        for (int i = 0; i < numberOfSubjects; i++) {     // Loop through the array
            Student student = students[i]; // Get the Student object at index i

            double averageScore = calculateAverageGrade(student, numberOfSubjects); // Calculate average score
            System.out.println("\nStudent " + student.getStudentName() + "'s Average Grade: " + averageScore); // Print average score

            // Calculate letter grade
            char letterGrade;  // Declare a variable of type char
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

            System.out.println("Letter Grade: " + letterGrade); // Print letter grade
        }
    }

    public static double calculateAverageGrade(Student student, int numberOfSubjects) {
        int totalScore = 0;
        int[] subjectScores = student.getSubjectScores();

        for (int score : subjectScores) {
            totalScore += score;
        }

        return (double) totalScore / numberOfSubjects;
    }

    public char calculateLetterGrade(Student student, int numberOfSubjects) {
        double averageScore = calculateAverageGrade(student, numberOfSubjects);

        if (averageScore >= 90) {
            return 'A';
        } else if (averageScore >= 80) {
            return 'B';
        } else if (averageScore >= 70) {
            return 'C';
        } else if (averageScore >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}