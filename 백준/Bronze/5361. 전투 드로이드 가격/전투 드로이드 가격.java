import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            double answer = 0;
            answer+=350.34 * sc.nextInt();
            answer+=230.90 * sc.nextInt();
            answer+=190.55 * sc.nextInt();
            answer+=125.30 * sc.nextInt();
            answer+=180.90 * sc.nextInt();
            System.out.printf("$%.2f\n",answer);
        }
    }
}