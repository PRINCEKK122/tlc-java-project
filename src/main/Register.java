import enums.Level;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Register {
    private final List<Student> students;
    public Register(List<Student> names) {
        this.students = names;
    }

    public List<String> getRegister() {
        List<String> students = new ArrayList<>();

        for (var student : this.students) {
            students.add(student.getName());
        }

        return students;
    }

    public List<String> getRegisterLevel(Level level) {
        List<String> students = new ArrayList<>();

        for (var student : this.students) {
            if (student.getLevel().equals(level)) {
                students.add(student.getName());
            }
        }

        return students;
    }

    public void printReport() {
        Map<Level, List<Student>> groupStudentByLevel = new HashMap<>();

        for (Student student : students) {
            var level = student.getLevel();
            if (groupStudentByLevel.containsKey(level)) {
                groupStudentByLevel.get(level).add(student);
            } else {
                groupStudentByLevel.put(level, List.of(student));
            }
        }

        System.out.println(groupStudentByLevel);
    }
}
