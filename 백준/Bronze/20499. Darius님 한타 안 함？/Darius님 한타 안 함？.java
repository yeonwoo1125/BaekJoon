import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>(Arrays.asList(br.readLine().split("/")));
        
        if(Integer.parseInt(list.get(0))+Integer.parseInt(list.get(2)) < Integer.parseInt(list.get(1)) || Integer.parseInt(list.get(1)) == 0) 
            System.out.println("hasu");
        else  System.out.println("gosu");
        
    }
}