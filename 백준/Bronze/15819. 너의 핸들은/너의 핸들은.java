import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int order = Integer.parseInt(st.nextToken());
        ArrayList<String> handles = new ArrayList<>();

        for(int i=0; i<n; i++)
            handles.add(br.readLine());
        Collections.sort(handles);

        System.out.println(handles.get(order-1));
    }
}