import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        for(int i=0; i<n; i++){
            String input = br.readLine();
            if(input.equals("anj")) {
                System.out.println("뭐야;");
                return;
            }
        }
        System.out.println("뭐야?");
    }
}