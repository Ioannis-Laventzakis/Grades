import org.example.Student;

import java.util.Scanner;

public class GradeCalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of GradeCalculator
        GradeCalculator gradeCalculator = new GradeCalculator();

        // Ask the user for the number of subjects
        System.out.println("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        // Create an array to store 5 Student objects
        Student[] students = new Student[5];

        // Input data for each student
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter data for Student " + (i + 1));

            // Ask for student ID and name
            System.out.print("Enter student ID: ");
            int studentId = scanner.nextInt();
            System.out.print("Enter student name: ");
            String studentName = scanner.next();

            // Create a new Student object
            students[i] = new Student(studentId, studentName, numberOfSubjects);

            // Input scores for each subject for the current student
            for (int j = 0; j < numberOfSubjects; j++) {
                System.out.print("Enter the score for subject " + (j + 1) + ": ");
                int score = scanner.nextInt();
                students[i].setSubjectScore(j, score);
            }
        }

        // Calculate average and determine letter grade for each student using GradeCalculator
        for (int i = 0; i < 5; i++) {
            Student student = students[i];

            // Use GradeCalculator to calculate average and determine letter grade
            gradeCalculator.calculateAndDisplayGrades(student, numberOfSubjects);
        }
    }
}
