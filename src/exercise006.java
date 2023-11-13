//the sum of the squares of the first ten natural numbers is, 1^2+2^2+...+10^2=385.
//the square of the sum of the first ten natural numbers is, (1+2+...+10)^2=55^2=3025.
//Hence the difference between the sum of the squares of the first ten natural number and the square of the sum is 3025-385=2640.
//find the difference between the sum of the squares of the first one hundred natural numbersand the square of the sum.
public class exercise006 {
    public static void main (String[] args){
        int nro = 100;
        int sum = sumOfSquares(nro);
        int square= squareOfSum(nro);
        System.out.println("the sum of the squares of the first " + nro + " is: " + sum);
        System.out.println("the square of the sum  " + nro + " is: " + square);
        System.out.println("the difference betwwen is: "+ (square-sum));
    }
    public static  int sumOfSquares(int numberLimit){
        int sum=0;
        for(int x = 1; x<=numberLimit; x++){
            int square = x*x;
            sum =square+sum;
        }
        return sum;
    }
    public static  int squareOfSum(int numberLimit){
        int sum=0;
        for(int x = 1; x<=numberLimit; x++){
            sum =x+sum;
        }
        return sum*sum;
    }
}
