import interfaces.Nameable;

import java.util.ArrayList;
import java.util.List;

public class Register {
    private final List<Nameable> names;
    public Register(List<Nameable> names) {
        this.names = names;
    }

    public List<String> getRegister() {
        List<String> students = new ArrayList<>();

        for (var student : names) {
            students.add(student.getName());
        }

        return students;
    }
}
