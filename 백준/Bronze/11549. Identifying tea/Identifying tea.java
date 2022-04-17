import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        int cnt = 0;
        for(int i=0; i<5; i++)
            if(answer == sc.nextInt()) cnt++;
        System.out.println(cnt);
    }
}