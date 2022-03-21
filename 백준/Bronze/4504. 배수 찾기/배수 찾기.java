import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       while(true){
            int a = sc.nextInt();
            if(a == 0) break;
            System.out.println(a%n == 0 ? a+" is a multiple of "+n+"." :  a+" is NOT a multiple of "+n+"." );
        }
    }
}