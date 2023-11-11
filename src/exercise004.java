import java.util.ArrayList;

/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91x99.
find the largest palindrome made from the product of two 3-digit numbers
*/
public class exercise004 {
    public static void main(String[] args){
        int [] digitLimits = {0,9,99,999,9999,99999,999999,9999999,99999999};
        int numberOfDigits=2;
        int largestPalindrome = findLargestPalindromeProduct(digitLimits[numberOfDigits]);

        System.out.println("The largest palindrome made from the product of two " + numberOfDigits + "-digit numbers is: " + largestPalindrome);
    }
    private static int reverse (int nro){
        String number = String.valueOf(nro);
        char [] digit = new char[number.length()];

        for(int x = 0; x <number.length(); x++){
            digit[number.length() - x -1]=number.charAt(x);
        }

        String reverse = new String(digit);
        int numberReverse = Integer.parseInt(reverse);
        return numberReverse;
    }
    private static boolean isPalindrome(int nro){
        return  nro == reverse(nro);
    }

    private static  int findLargestPalindromeProduct (int limit){
        int largestPalindorme = 0;
        for (int i = limit; i>0; i--){
            for(int j = limit; j > 0 ; j--){
                int product = i * j;
                if(isPalindrome(product) && product>largestPalindorme){
                    largestPalindorme=product;
                }
            }
        }
        return largestPalindorme;
    }
}
