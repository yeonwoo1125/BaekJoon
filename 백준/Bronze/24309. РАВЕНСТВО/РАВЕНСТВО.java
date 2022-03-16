import java.util.*;
import java.math.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());
        BigInteger c = new BigInteger(sc.next());
        BigInteger x = (b.divide(a)).subtract(c.divide(a)); 
        
        System.out.println(x);
        
    }
}