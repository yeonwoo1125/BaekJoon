import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i=0; i<5; i++){
             sum += (int)Math.pow(sc.nextInt(),2);
        }
        System.out.print(sum%10);
    }
}