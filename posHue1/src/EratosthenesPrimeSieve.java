import java.util.ArrayList;
import java.util.List;

public class EratosthenesPrimeSieve implements PrimeSieve {
    private int limit;
    public EratosthenesPrimeSieve(int limit) {
        this.limit = limit;
    }
    //checks if the number is prime
    @Override
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        int limit = (int) Math.sqrt(n);
        for (int i = 5; i <= limit; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
    //prints all primes up to the given limit
    @Override
    public void printPrimes() {
        for (int i = 0; i < this.limit; i++) {
            boolean b = isPrime(i);
            if(b){
                System.out.println(i);
            }
        }
    }
}
