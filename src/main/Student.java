import java.util.List;

public class Student {
    private final List<Double> grades;

    public Student(List<Double> grades) {
        this.grades = grades;
    }

    public double getAverageGrade() {
        double total = 0.0;

        for (double grade : grades) {
            total += grade;
        }

        return total / grades.size();
    }
}
