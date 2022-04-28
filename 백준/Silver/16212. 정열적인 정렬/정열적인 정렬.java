import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
        int n =Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++)
            list.add(Integer.parseInt(st.nextToken()));
        Collections.sort(list);

        for(int i=0; i<n; i++)
            bw.write(list.get(i)+" ");
        bw.flush();
    }
}