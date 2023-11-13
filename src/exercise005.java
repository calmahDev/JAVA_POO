/*
2520 is the smalllest number that can be divided by each of the numbers form 1 to 10 without any remainder.
what is the smallest  positive number that is evenly divisible by all of numbers from 1 to 20
*/
public class exercise005 {
    public static void main(String[] args){
        int dividers=10;
        int nro=0;

        outerloop:
        for(int x = 1; x > 0; x++){
            for (int y = 1; y <=dividers+1; y++){
                if(x % y != 0){
                    break;
                } else if (y==dividers) {
                    nro = x;
                    break outerloop;
                }
            }
        }

        System.out.println(nro);
    }

}
