package prime.number.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeCalculatorController {

    @Autowired
    private PrimeCalculator calculator;

    @GetMapping("/prime/{n}")
    public ResponseEntity<String> calculate(@PathVariable("n") Integer n) {
        if (n <= 0) {
            return ResponseEntity.badRequest()
                    .body("n must be a positive number");
        }
        return ResponseEntity.ok()
                .body(String.valueOf(calculator.calculatePrime(n)));
    }
}
