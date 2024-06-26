import java.util.List;

public class NaughtyStudent extends Student {
    public NaughtyStudent(List<Double> grades) {
        super(grades);
    }

    @Override
    public double getAverageGrade() {
        return super.getAverageGrade() * 1.1;
    }
}