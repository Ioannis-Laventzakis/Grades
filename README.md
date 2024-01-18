# Java Grade Calculator

## Overview

The Java Grade Calculator is a program designed to calculate the average grade of a student based on scores in different subjects. The program has been expanded to include a `Student` class, allowing for the input of multiple students and their respective grades.

## How to Use

### Step 1: Set Up Your Project

1. Create a new Java project in your Integrated Development Environment (IDE) of choice.
2. Set up a new Java class named `GradeCalculator`.

### Step 2: Create a Student Class

A new class `Student` has been introduced to represent individual students. It includes attributes such as student ID, name, and an array to store scores for each subject.

java
public class Student {
    // ... (code for the Student class as provided earlier)
}
Step 3: Use the GradeCalculator Class
The GradeCalculator class has been modified to utilize the Student class. It now collects data for 5 students and calculates the average and letter grade for each student.

java
Copy code
import java.util.Scanner;

public class GradeCalculator {
    // ... (code for the GradeCalculator class as provided earlier)
}
Step 4: Run the GradeCalculatorTest Class
A new test class, GradeCalculatorTest, has been introduced to test the functionality of the program. It creates an instance of GradeCalculator, inputs data for 5 students, and displays the average grade and letter grade for each student.

java
Copy code
public class GradeCalculatorTest {
    // ... (code for the GradeCalculatorTest class as provided earlier)
}
Feel free to run and test the GradeCalculatorTest class to verify the expanded functionality of the program.

Additional Features
The program now supports the following additional features:

Student Class: The introduction of the Student class allows for the representation of individual students with their unique IDs, names, and scores.
Multiple Students: The program can now handle input and calculation for up to 5 students, providing individual results for each student.
Improved Input Handling: Input for student IDs now accepts non-numeric values to accommodate diverse student identifiers.