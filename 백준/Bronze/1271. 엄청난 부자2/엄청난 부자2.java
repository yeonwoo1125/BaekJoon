import java.util.*;
import java.math.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());

        System.out.println(a.divide(b));
        System.out.println(a.remainder(b));
    }
}