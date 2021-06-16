package prime.number.calculator;

public class PrimeCalculatorApplication {

    private static final PrimeCalculator calculator = new PrimeCalculator();

    public static void main(String[] args) {
        calculator.calculatePrime(200);
        calculator.calculatePrime(400);
        calculator.calculatePrime(1000);
        calculator.calculatePrime(2000);
        calculator.calculatePrime(4000);
        calculator.calculatePrime(8000);
        calculator.calculatePrime(20_000);
        calculator.calculatePrime(40_000);
        calculator.calculatePrime(100_000);
    }


}
