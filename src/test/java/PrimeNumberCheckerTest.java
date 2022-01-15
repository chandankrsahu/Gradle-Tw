import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeNumberCheckerTest {
    @Test
    void ShouldReturnFalseIfTheNumberIsLessThanTwo() {
        PrimeNumberChecker primeNumberChecker = new PrimeNumberChecker(1);
        Boolean isPrime=primeNumberChecker.check();
        assertFalse(isPrime);
    }

    @Test
    void ShouldReturnFalseIfTheNumberIsNotPrime() {
        PrimeNumberChecker primeNumberChecker = new PrimeNumberChecker(6);
        Boolean isPrime=primeNumberChecker.check();
        assertFalse(isPrime);
    }

    @Test
    void ShouldReturnTrueIfTheNumberIsPrime() {
        PrimeNumberChecker primeNumberChecker = new PrimeNumberChecker(7);
        Boolean isPrime=primeNumberChecker.check();
        assertTrue(isPrime);
    }
}
