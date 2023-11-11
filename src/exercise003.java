/*
the prime factor of 13195 are 5,7,13 an 29.
what is the largest prime factor of the number 600851475143
*/
import java.util.ArrayList;
public class exercise003 {
    public static void main(String[] args) {
        ArrayList<Integer> primeFactors = calculatePrimeFactors(600851475143L);
        System.out.println("the largest prime factor is: " + primeFactors);
    }

    private static ArrayList<Integer> calculatePrimeFactors(long number) {
        ArrayList<Integer> primeFactors = new ArrayList<>();

        for (int factor = 1; factor <= number; factor++) {
            if (number % factor == 0 && isPrime(factor)) {
                number = number / factor;
                primeFactors.add(factor);
                factor--; // Check the same factor again after division
            }
        }

        return primeFactors;
    }

    private static boolean isPrime(long number) {
        if (number < 2) {
            return false;
        }
        for (int factor = 2; factor <= Math.sqrt(number); factor++) {
            if (number % factor == 0) {
                return false;
            }
        }
        return true;
    }
}
