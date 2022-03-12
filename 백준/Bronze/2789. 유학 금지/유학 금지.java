import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> xList = new ArrayList<>(Arrays.asList("CAMBRIDGE".split("")));
        String str = br.readLine();
        
        for(int i=0; i<xList.size(); i++){
           str= str.replace(xList.get(i),"");
        }
        System.out.println(str);
    }
}