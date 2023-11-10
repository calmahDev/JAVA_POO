/*
if we list all natural numbers below 10 tha are multiples of 3 or 5, we get 3,5,6 and 9. the sum of these mulptiples is 23.
fid the sum of all the multiples of 3 or 5 below 1000
 */
import java.util.ArrayList;

public class exercise001 {
    public static void main(String[] args) {
        int limit = 1000;
        ArrayList<Integer> multiples = listMultiples(limit);
        int sum = calculateSum(multiples);
        System.out.println("Sum: " + sum);
        System.out.println("Multiples: " + multiples);
    }

    private static ArrayList<Integer> listMultiples(int limit) {
        ArrayList<Integer> multiples = new ArrayList<Integer>();
        for (int x = 0; x < limit; x++) {
            if (x % 3 == 0 || x % 5 == 0) {
                multiples.add(x);
            }
        }
        return multiples;
    }

    private static int calculateSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}

