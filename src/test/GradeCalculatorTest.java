import org.example.GradeCalculator;
import org.example.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GradeCalculatorTest {

    @Test
    public void calculatesAverageGradeCorrectly() {
        Student student = new Student(1, "John", 3);
        student.setSubjectScore(0, 85);
        student.setSubjectScore(1, 90);
        student.setSubjectScore(2, 95);

        GradeCalculator gradeCalculator = new GradeCalculator();
        double averageGrade = gradeCalculator.calculateAverageGrade(student, 3);

        assertEquals(90, averageGrade);
    }

    @Test
    public void assignsCorrectLetterGrade() {
        Student student = new Student(1, "John", 3);
        student.setSubjectScore(0, 85);
        student.setSubjectScore(1, 90);
        student.setSubjectScore(2, 95);

        GradeCalculator gradeCalculator = new GradeCalculator();
        char letterGrade = gradeCalculator.calculateLetterGrade(student, 3);

        assertEquals('A', letterGrade);
    }

    @Test
    public void handlesZeroSubjects() {
        Student student = new Student(1, "John", 0);

        GradeCalculator gradeCalculator = new GradeCalculator();
        double averageGrade = gradeCalculator.calculateAverageGrade(student, 0);

        assertEquals(0, averageGrade);
    }

    @Test
    public void handlesNegativeScores() {
        Student student = new Student(1, "John", 3);
        student.setSubjectScore(0, -85);
        student.setSubjectScore(1, -90);
        student.setSubjectScore(2, -95);

        GradeCalculator gradeCalculator = new GradeCalculator();
        double averageGrade = gradeCalculator.calculateAverageGrade(student, 3);

        assertTrue(averageGrade < 0);
    }
}