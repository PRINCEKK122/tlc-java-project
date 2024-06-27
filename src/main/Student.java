import enums.Level;
import interfaces.HasLevel;
import interfaces.Nameable;

import java.util.List;

public class Student implements Nameable, HasLevel {
    private final List<Double> grades;
    private final String name;
    private final Level level;

    public Student(String name, Level level, List<Double> grades) {
        this.name = name;
        this.grades = grades;
        this.level = level;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Level getLevel() {
        return level;
    }

    public double getAverageGrade() {
        double total = 0.0;

        for (double grade : grades) {
            total += grade;
        }

        return total / grades.size();
    }
}
