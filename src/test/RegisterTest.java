import interfaces.Nameable;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {

    @Test
    void testGetRegister() {
        List<Nameable> students = List.of(
                new Student("Student 1", List.of(91.5, 92.5, 93.5)),
                new Student("Student 2", List.of(80.5, 81.5, 82.5)),
                new Student("Student 3", List.of(70.5, 68.5, 87.0))
        );

        var expected = students.stream().map(Nameable::getName).toArray();
        var register = new Register(students);

        assertArrayEquals(expected, register.getRegister().toArray());
    }

}