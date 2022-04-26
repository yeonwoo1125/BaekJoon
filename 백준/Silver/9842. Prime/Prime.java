import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 0;
        int i=1;
        while(cnt!=n){
            i++;
            if(isPrime(i)){
                cnt++;
            }  
        }
        System.out.println(i);
    }
    static boolean isPrime(int n){
        for(int i=2; i*i<=n; i++){
            if(n%i == 0) return false;
        }
        return true;
    }
}