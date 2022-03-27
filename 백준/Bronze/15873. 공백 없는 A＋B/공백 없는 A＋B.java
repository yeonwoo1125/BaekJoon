import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int a = n/10;
        int b = n%100;

        if(a > 10) a/=10;
        if(b>10) b%=10;
        System.out.print(a+b);
    }
}