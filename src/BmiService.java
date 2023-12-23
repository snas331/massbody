public class BmiService {

    public int calculate(int WeightInKg, double heightInMeters) {

        double bmi = WeightInKg / heightInMeters / heightInMeters;

        return (int)bmi;
    }
}
