import java.io.*;

class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for(int i=n; ; i++){
            StringBuilder sb = new StringBuilder(Integer.toString(i));
            if(i == 1){
                System.out.print("2");
                break;
            } 
            if(chkPrime(i)){
                if(Integer.toString(i).equals(sb.reverse().toString())) {
                    System.out.print(i);
                    break;
                }
            }
        }
    }

    static boolean chkPrime(int n){
        for(int i=2 ; i*i<=n; i++) 
		  if(n%i ==0 ) return false;    
        
	   return true;
    }
}