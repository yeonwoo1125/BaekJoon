import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int cnt = 0;
            int n = Integer.parseInt(br.readLine());
            if(n == 0) break;
            for(int i=n+1; i<=2*n; i++)
                if(isPrime(i)) cnt++;
            System.out.println(cnt);
  
        }
    }
    static boolean isPrime(int num){
        for(int i=2 ; i*i<=num; i++) 
		  if(num%i ==0) return false;    
        
	   return true;
    }
}
