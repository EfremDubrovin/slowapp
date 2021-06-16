package prime.number.calculator;

import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.ZonedDateTime;

@Component
public class PrimeCalculator {

    /**
     * calculates and prints the nth prime
     * @param n - prime position
     */
    public long calculatePrime(int n) {
        ZonedDateTime start = ZonedDateTime.now();
        long num = 1, count = 0, i;
        while (count < n) {
            num = num + 1;
            for (i = 2; i <= num; i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (i == num) {
                count = count + 1;
            }
        }
        ZonedDateTime end = ZonedDateTime.now();
        System.out.println("Calculated " + n + "th prime number: " + num + " for " + Duration.between(start, end));
        return num;
    }
}
