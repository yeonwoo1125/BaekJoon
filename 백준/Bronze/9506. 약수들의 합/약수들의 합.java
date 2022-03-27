import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        while(n != -1){
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=1; i<=n/2; i++){
                if(n%i == 0) list.add(i);
            }
            int sum = 0;
            for(int i=0; i<list.size(); i++){
                sum+=list.get(i);
            }
            if(sum != n) System.out.println(n+" is NOT perfect.");
            else {
                System.out.print(n +" = "+list.get(0));
                for(int i=1; i<list.size(); i++){
                    System.out.print(" + "+list.get(i));
                }
                System.out.println();
            }
            n = Integer.parseInt(br.readLine());
        }
    }
}