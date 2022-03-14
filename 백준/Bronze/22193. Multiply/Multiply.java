import java.util.*;
import java.math.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        System.out.println(new BigInteger(sc.next()).multiply(new BigInteger(sc.next())));
    }
}