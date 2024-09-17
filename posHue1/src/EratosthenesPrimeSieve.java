import java.util.ArrayList;
import java.util.List;

public class EratosthenesPrimeSieve implements PrimeSieve {
    private int limit;
    public EratosthenesPrimeSieve(int limit) {
        this.limit = limit;
    }
    //checks if the number is prime
    @Override
    public boolean isPrime(int p) {
        if (p <= 1) {
            return false;
        }
        if (p == 2 || p == 3) {
            return true;
        }
        if (p % 2 == 0 || p % 3 == 0) {
            return false;
        }

        for (int i = 2; i < p; i++) {
            if (p % i == 0) {
                return false;
            } else return true;
        }
        return false;
    }
    //prints all primes up to the given limit
    @Override
    public void printPrimes() {
        System.out.print("Primesal: ");
        for (int i = 0; i < this.limit; i++) {
            boolean b = isPrime(i);
            if(b){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }
}
