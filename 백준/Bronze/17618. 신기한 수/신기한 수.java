import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        for(int i=1; i<=n; i++){
            int sum = 0;
            String num = String.valueOf(i);
            for(int j = 0; j<num.length(); j++){
                sum+=num.charAt(j)-'0';
            }
            if(i%sum == 0) cnt++;
        }
        System.out.println(cnt);
            
    }
}