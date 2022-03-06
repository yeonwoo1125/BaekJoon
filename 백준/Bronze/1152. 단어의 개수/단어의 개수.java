import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList(Arrays.asList(br.readLine().trim().split(" ")));

        list.removeAll(Arrays.asList(""," "));
        
        System.out.println(list.size());
    }
}