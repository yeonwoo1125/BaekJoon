import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            String s = String.valueOf((int)Math.pow(a,2));
            if(s.substring(s.length() - String.valueOf(a).length(),s.length()).equals(String.valueOf(a))) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}