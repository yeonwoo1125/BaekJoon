import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=0; i<5; i++){
            int news = sc.nextInt();
            System.out.print(news - n*m +" ");
        }
    }
}