import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

class LectureTest {
    private Collection<Student> students;
    private final Lecture lecture = new Lecture();

    @BeforeEach
    void setUp() {
        students = List.of(
                new Student("Student 1", List.of(95.0, 85.5, 78.5)),
                new Student("Student 2", List.of(87.5, 78.0, 65.0)),
                new Student("Student 3", List.of(92.5, 90.0, 91.5))
        );

        for (Student student : students) {
            lecture.enter(student);
        }
    }

    @Test
    @DisplayName("Get the Highest Grade from the lecture")
    void testGetHighestAverageGrade() {
        var expected = students.stream()
                .mapToDouble(Student::getAverageGrade)
                .max()
                .orElse(0.0);
        assertEquals(expected, lecture.getHighestAverageGrade());
    }
}