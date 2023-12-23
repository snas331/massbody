public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int WeightInKg = 90;
        double heightInMeters = 1.90;
        int bmi = service.calculate(WeightInKg, heightInMeters);
        System.out.println(bmi);

    }
}