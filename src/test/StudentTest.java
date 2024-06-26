import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private final List<Double> grades = List.of(85.0, 95.0, 99.0);
    private final Student student = new Student(grades);

    @Test
    void testGetAverageGrade() {
        var expected = grades.stream()
                .mapToDouble(n -> n)
                .average()
                .orElse(0.0);

        assertEquals(expected, student.getAverageGrade());
    }

}