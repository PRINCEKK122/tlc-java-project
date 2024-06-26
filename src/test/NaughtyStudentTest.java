import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NaughtyStudentTest {
    @Test
    void testGetAverageGradeForNaughtyStudent() {
        var grades = List.of(85.0, 67.5, 69.5);

        var student = new Student(grades);
        var naughtyStudent = new NaughtyStudent(grades);

        assertAll("Test naughty",
                () -> assertTrue(student.getAverageGrade() < naughtyStudent.getAverageGrade()),
                () -> assertInstanceOf(Student.class, naughtyStudent),
                () -> assertEquals(student.getAverageGrade() * 1.1, naughtyStudent.getAverageGrade())
        );

    }
}