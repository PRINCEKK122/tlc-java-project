import java.util.List;

public class NaughtyStudent extends Student {
    public NaughtyStudent(String name, List<Double> grades) {
        super(name, grades);
    }

    @Override
    public double getAverageGrade() {
        return super.getAverageGrade() * 1.1;
    }
}