import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();

        if(m+n>=60) {
            h+=(m+n)/60;
            m = (m+n)%60;
        }
        else m = m+n;
        if(h>=24) h-=24;

        System.out.println(h+" "+m);
    }
}