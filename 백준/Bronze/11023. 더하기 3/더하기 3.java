import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;
        while(st.hasMoreTokens()){
            sum+= Integer.parseInt(st.nextToken());
        }
        System.out.println(sum);
    }
}