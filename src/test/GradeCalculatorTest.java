import org.example.GradeCalculator; // Import the GradeCalculator class
import org.example.Student; // Import the Student class
import org.junit.jupiter.api.Test; // Import the Test annotation
import static org.junit.jupiter.api.Assertions.*; // Import static methods for assertions

public class GradeCalculatorTest {

    @Test
    public void calculatesAverageGradeCorrectly() { // Test for average grade calculation
        Student student = new Student(1, "John", 3);
        student.setSubjectScore(0, 85);
        student.setSubjectScore(1, 90);
        student.setSubjectScore(2, 95);

        GradeCalculator gradeCalculator = new GradeCalculator();
        double averageGrade = gradeCalculator.calculateAverageGrade(student, 3);

        assertEquals(90, averageGrade);
    }

    @Test
    public void assignsCorrectLetterGrade() { // Test for letter grade assignment
        Student student = new Student(1, "John", 3); // Create a new Student object
        student.setSubjectScore(0, 85);
        student.setSubjectScore(1, 90);
        student.setSubjectScore(2, 95);

        GradeCalculator gradeCalculator = new GradeCalculator();
        char letterGrade = gradeCalculator.calculateLetterGrade(student, 3);

        assertEquals('A', letterGrade);
    }

    @Test
    public void handlesZeroSubjects() { // Test for divide by zero error
        Student student = new Student(1, "John", 0); // Create a new Student object

        GradeCalculator gradeCalculator = new GradeCalculator();
        double averageGrade = gradeCalculator.calculateAverageGrade(student, 0); // Calculate average score

        assertEquals(0, averageGrade);
    }

    @Test
    public void handlesNegativeScores() {
        Student student = new Student(1, "John", 3);
        student.setSubjectScore(0, -85);
        student.setSubjectScore(1, -90);
        student.setSubjectScore(2, -95);

        GradeCalculator gradeCalculator = new GradeCalculator();
        double averageGrade = gradeCalculator.calculateAverageGrade(student, 3); // Calculate average score

        assertTrue(averageGrade < 0);
    }
}
