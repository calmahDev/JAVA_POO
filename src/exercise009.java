import java.util.ArrayList;

/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which, a^2 + b^2 = c^2.
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5 ^2.
there exists exactly one Pythagorean triplet for which a + b + c = 1000.
find the product abc
*/
public class exercise009 {
    public static void main (String[] args){
        ArrayList<Integer> ABC = findNumbers();
        int a = ABC.get(0);
        int b = ABC.get(1);
        int c = ABC.get(2);
        Integer product = productABC(a, b, c);
        System.out.println(product +" "+ ABC);
    }
    private static boolean isSume1000 (int a, int b, int c){
        return (a+b+c)==1000;
    }
    private static Integer productABC(int a, int b, int c){
        Integer product = 1;
        product = a * b * c;
        return  product;
    }
    private static ArrayList<Integer> findNumbers(){
        ArrayList<Integer> ABC = new ArrayList<> ();
        outerloop:
        for ( int x = 1; x > 0 ; x++){
            for (int y = 1; y < x; y++){
                for ( int z = 1; z < y; z++){
                    if ( isSume1000(x,y,z) && z*z+y*y == x*x ){
                        ABC.add(z);
                        ABC.add(y);
                        ABC.add(x);
                        break outerloop;
                    }
                }
            }
        }
        return ABC;

    }
}
