import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        while(true){
            if(n%5 == 0) {
                cnt+=n/5;
                System.out.println(cnt);
                break;
            }
            else {
                n-=3;
                cnt++;
            }
            if(n < 0) {
                System.out.println("-1");
                break;
            }
        }
       
    }
}