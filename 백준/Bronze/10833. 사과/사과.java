import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for(int i=0; i<n; i++){
            int p = sc.nextInt();
            int a = sc.nextInt();
            sum += a%p;
        }
        System.out.println(sum);
    }
}