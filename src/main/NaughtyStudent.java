import enums.Level;

import java.util.List;

public class NaughtyStudent extends Student {
    public NaughtyStudent(String name, Level level, List<Double> grades) {
        super(name, level, grades);
    }

    @Override
    public double getAverageGrade() {
        return super.getAverageGrade() * 1.1;
    }
}