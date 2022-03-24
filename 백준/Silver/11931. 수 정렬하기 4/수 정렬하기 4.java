import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++)
            list.add(Integer.parseInt(br.readLine()));
        Collections.sort(list, Collections.reverseOrder());
        for(int val : list)
            bw.write(val+"\n");
        bw.flush();
    }
}