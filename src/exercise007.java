/*by listing the first six prime numbers : 2,3,5,11 and 13, we can see that the 5th prime is 13.
what is the 10001st prime number*/
public class exercise007 {
    public static void main(String[] args){
        int limit = 10001;
        int nro = findPrime(limit);
        System.out.println(nro);
    }
    private static boolean isPrime( int nro){
        boolean prime = true;
        for ( int x = 2; x < nro;x++){
            if(nro % x == 0){
                prime =false;
            }
        }
        return prime;
    }

    private  static int findPrime( int limit){
        int contador=0;
        int prime=0;
        for( int i = 2; contador <= limit; i++){
            if (isPrime(i)){
                contador++;
                prime=i;
            }
        }
        return prime;
    }
}
