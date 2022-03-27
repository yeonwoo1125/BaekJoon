import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());


        if(b > a){
            long tmp = b;
            b = a;
            a = tmp;
        }
        long sum = (a+b) * (a-b+1) / 2;
        System.out.println(sum); 
    }
}