import java.io.*;
import java.util.*;

class Main{
    public static void  main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int input = Integer.parseInt(br.readLine());
        
        for(int i=0; i<input; i++){
            ArrayList<String> list = new ArrayList(Arrays.asList(br.readLine().split(",")));
               System.out.println(Integer.parseInt(list.get(0))+Integer.parseInt(list.get(1)));
        }
        
    }
}