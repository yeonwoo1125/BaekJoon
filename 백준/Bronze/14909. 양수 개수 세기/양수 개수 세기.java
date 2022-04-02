import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt = 0;
        while(st.hasMoreTokens()){
            if(Integer.parseInt(st.nextToken()) > 0) cnt++;
        }
        System.out.println(cnt);
    }
}