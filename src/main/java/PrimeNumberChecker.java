import static java.lang.Math.sqrt;

public class PrimeNumberChecker {
    private final int number;

    public PrimeNumberChecker(int number) {
        this.number = number;
    }

    public Boolean check() {
        if(number<2)return  false;
        for(int divisor = 2; divisor<= getSqrt(); divisor++)
            if (isaDivisor(divisor)) {
                return false;
            }
        return  true;

    }

    private double getSqrt() {
        return sqrt(number);
    }

    private boolean isaDivisor(int divisor) {
        return number % divisor == 0;
    }
}
