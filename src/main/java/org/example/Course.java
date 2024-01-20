package org.example;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private int courseID;
    private String courseName;
    private int numberOfStudents;
    private String courseDescription;
    private String courseInstructor;
    private List<Student> students;

    public Course(int courseID, String courseName, String courseDescription, String courseInstructor) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseInstructor = courseInstructor;
        this.students = new ArrayList<>();
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(String courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void removeStudent(Student student) {
        this.students.remove(student);
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseID=" + courseID +
                ", courseName='" + courseName + '\'' +
                ", numberOfStudents=" + getNumberOfStudents() +
                ", courseDescription='" + courseDescription + '\'' +
                ", courseInstructor='" + courseInstructor + '\'' +
                '}';
    }
}