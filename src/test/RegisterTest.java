import enums.Level;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {
    private List<Student> students;
    private Register register;

    @BeforeEach
    void setUp() {
        students = List.of(
                new Student("Student 1", Level.JUNIOR, List.of(91.5, 92.5, 93.5)),
                new Student("Student 2", Level.TERTIARY, List.of(80.5, 81.5, 82.5)),
                new Student("Student 3", Level.JUNIOR, List.of(70.5, 68.5, 87.0))
        );
        register = new Register(students);
    }

    @Test
    void testGetRegister() {
        var expected = students.stream().map(Student::getName).toArray();

        assertArrayEquals(expected, register.getRegister().toArray());
    }

    @Test
    void testGetRegisterByLevel() {
        var expected = register.getRegisterLevel(Level.JUNIOR);

        assertAll("Register",
                () -> assertEquals(2, register.getRegisterLevel(Level.JUNIOR).size()),
                () -> assertEquals(
                        Arrays.toString(new String[]{"Student 1", "Student 3"}),
                        Arrays.toString(register.getRegisterLevel(Level.JUNIOR).toArray())
                )
        );
    }

    @Test
    void testPrintReport() {
        register.printReport();
    }
}