import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int cnt = 0;
        for(int i=m; i<=n; i++){
            if(i == 1) continue;
            if(chkPrime(i)) System.out.println(i);
        }
    }
    static boolean chkPrime(int n){
        for(int i=2 ; i*i<=n; i++) 
		  if(n%i ==0 ) return false;    
        
	   return true;
    }
}
