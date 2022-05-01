import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][2];

        for(int i=0; i<n; i++)
            arr[i] = br.readLine().split(" ");
        Arrays.sort(arr, (o1, o2) -> { 
            if(o1[0] == o2[0])
                return Integer.compare(Integer.parseInt(o1[1]),Integer.parseInt(o2[1])); 
            else
                return Integer.compare(Integer.parseInt(o1[0]),Integer.parseInt(o2[0])); 
            });

        for(int i=0; i<n; i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}