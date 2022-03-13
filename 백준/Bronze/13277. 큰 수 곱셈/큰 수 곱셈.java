import java.util.*;
import java.math.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());

        sc.close();
        System.out.println(a.multiply(b));
    }
}
