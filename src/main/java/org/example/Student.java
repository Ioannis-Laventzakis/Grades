package org.example;

import java.time.LocalDate;

public class Student {
    private final String[] bookNames; // Declare a final variable
    // Fields (instance variables)
    private int studentId;
    private String studentName;
    private int[] subjectScores;
    private int age;
    private String sex;
    private String email;
    private LocalDate dateOfBirth;

    // Constructor
    public Student(int studentId, String studentName, int numberOfSubjects) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.subjectScores = new int[numberOfSubjects];
        this.bookNames = new String[numberOfSubjects];
    }

    // Getter for studentId
    public int getStudentId() {
        return studentId;
    }

    // Setter for studentId
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // Getter for studentName
    public String getStudentName() {
        return studentName;
    }

    // Setter for studentName
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // Getter for subjectScores
    public int[] getSubjectScores() {
        return subjectScores;
    }

    // Setter for subjectScores
    public void setSubjectScores(int[] subjectScores) {
        this.subjectScores = subjectScores;
    }

    // Method to set a specific subject score
    public void setSubjectScore(int subjectIndex, int score) {
        this.subjectScores[subjectIndex] = score;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for sex
    public String getSex() {
        return sex;
    }

    // Setter for sex
    public void setSex(String sex) {
        this.sex = sex;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter for dateOfBirth
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    // Setter for dateOfBirth
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}