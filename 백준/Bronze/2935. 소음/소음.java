import java.io.*;
import java.math.*;

class Main{
    public static void main(String[] main) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        BigInteger a = new BigInteger(br.readLine());
        char c = br.readLine().charAt(0);
        BigInteger b = new BigInteger(br.readLine());
        
        if(c == '+') System.out.println(a.add(b));
        else System.out.println(a.multiply(b));
        
    }
}