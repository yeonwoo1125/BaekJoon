import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        int y = 0;
        for(int i=0; i<n; i++){
            y+=arr[i]/30*10;
            if(arr[i]%29 > 0) y+=10;
        }
        int m = 0;
        for(int i=0; i<n; i++){
            m+=arr[i]/60*15;
            if(arr[i]%59 > 0) m+=15;
        }

        if(y == m) System.out.println("Y M " +m);
        else System.out.println(y > m ? "M "+m : "Y "+y);
    }
}