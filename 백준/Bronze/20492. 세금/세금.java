import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        sc.close();

        System.out.print(m*78/100+" ");
        System.out.println(m*80/100 + m*20/100*78/100);
    }
}