import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> hashset = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt = 0;
        
        for(int i=0; i<n; i++)
            hashset.add(br.readLine());
        for(int i=0; i<m; i++){
            if(hashset.contains(br.readLine())) cnt++;
        }
        System.out.println(cnt);
            
    }
}