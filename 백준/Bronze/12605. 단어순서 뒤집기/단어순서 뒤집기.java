import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for(int i=1; i<=n; i++){
            ArrayList<String> list = new ArrayList<>(Arrays.asList(br.readLine().split(" ")));
            System.out.print("Case #"+i+": ");
            for(int j=list.size()-1; j>=0; j--)
                System.out.print(list.get(j)+" ");
            System.out.println();
        }    
    }
}