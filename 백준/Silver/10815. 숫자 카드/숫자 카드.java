import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> hashset = new HashSet<>(n);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++){
            hashset.add(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<m; i++){
            if(hashset.contains(st.nextToken())) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }
}