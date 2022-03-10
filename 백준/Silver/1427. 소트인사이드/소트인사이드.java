import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList(Arrays.asList(String.valueOf(br.readLine()).split("")));

        Collections.sort(list);
        Collections.reverse(list);

        for(int i=0; i<list.size(); i++)
            System.out.print(list.get(i));
        
    }
}