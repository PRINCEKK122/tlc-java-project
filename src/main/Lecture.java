import java.util.ArrayList;
import java.util.List;

public class Lecture {
    private final List<Student> students = new ArrayList<>();

    public void enter(Student student) {
        students.add(student);
    }

    public double getHighestAverageGrade() {
        double highestGrade = Double.MIN_VALUE;

        for (Student student : students) {
            var grade = student.getAverageGrade();
            if (grade > highestGrade) highestGrade = grade;
        }

        return highestGrade;
    }
}
