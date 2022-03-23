import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        String[] arr = br.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++)
            list.add(Integer.parseInt(arr[i]));

        Collections.sort(list);
        System.out.println(list.get(k-1));
    }
}