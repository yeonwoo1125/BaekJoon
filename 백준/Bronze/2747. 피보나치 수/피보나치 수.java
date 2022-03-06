import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int Fibo[] = new int[n*10];
        Fibo[0] = 0;
        Fibo[1] = 1;

        for (int i = 2; i < n+1; i++) {
            Fibo[i] = Fibo[i - 1] + Fibo[i - 2];
        }
        System.out.print(Fibo[n]);
    }
}