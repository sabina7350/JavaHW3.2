public class BmiService {
    public int calculate(double meter, int kg) {
        int bmi;
        bmi = (int) ((kg) / (meter * meter));
        return bmi;
    }
}