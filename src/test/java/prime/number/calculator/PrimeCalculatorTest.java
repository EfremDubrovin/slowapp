package prime.number.calculator;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class PrimeCalculatorTest {

    @Test
    public void calculateBigPrime_add_conditional_breakpoint() {
        // Given
        PrimeCalculator calculator = new PrimeCalculator();
        int n = 100_000;

        // When
        long nthPrime = calculator.calculatePrime(n);

        // Then
        assertThat("Nth prime should match", nthPrime, equalTo(1_299_709L));
    }
}