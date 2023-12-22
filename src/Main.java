public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int kg = 90;
        int bmi = service.calculate(kg);
        System.out.println(bmi);

    }
}