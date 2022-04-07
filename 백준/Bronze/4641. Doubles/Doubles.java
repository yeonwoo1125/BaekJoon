import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String input = br.readLine();
            if(input.equals("-1")) break;
            StringTokenizer st = new StringTokenizer(input);
           
            ArrayList<Integer> list = new ArrayList<>();
            while(true){
                int n = Integer.parseInt(st.nextToken());
                if(n == 0) break;
                list.add(n);
            }
            int cnt = 0;
            for(int i=0; i<list.size();i++)
                if(list.contains(list.get(i)*2)) cnt++;
            
            System.out.println(cnt);
        }
    }
}