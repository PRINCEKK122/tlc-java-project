import interfaces.Nameable;

import java.util.List;

public class Student implements Nameable {
    private final List<Double> grades;
    private final String name;

    public Student(String name, List<Double> grades) {
        this.name = name;
        this.grades = grades;
    }

    public double getAverageGrade() {
        double total = 0.0;

        for (double grade : grades) {
            total += grade;
        }

        return total / grades.size();
    }

    @Override
    public String getName() {
        return name;
    }
}
