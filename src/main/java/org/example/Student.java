package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private int studentId;
    private String studentName;
    private int[] subjectScores;
    private int age;
    private String sex;
    private String email;
    private LocalDate dateOfBirth;

    // Getter methods
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int[] getSubjectScores() {
        return subjectScores;
    }

    public boolean isPassed(){
        return getAverageGrade() >= 60;
    }

    // Assuming getAverageGrade is a method that calculates the average grade of the student
    public double getAverageGrade() {
        // Implementation goes here
        return 0;
    }

    // Constructor
    public Student(int studentId, String studentName, int numberOfSubjects) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.subjectScores = new int[numberOfSubjects];
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setSubjectScores(int[] subjectScores) {
        this.subjectScores = subjectScores;
    }

    public void setSubjectScore(int subjectIndex, int score) {
        this.subjectScores[subjectIndex] = score;
    }
}