package org.example;

public class Student {
    private int studentId;
    private String studentName;
    private int[] subjectScores;
    //Getter methods
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int[] getSubjectScores() {
        return subjectScores;
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
