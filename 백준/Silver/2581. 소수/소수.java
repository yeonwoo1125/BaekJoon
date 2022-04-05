import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = m; i<=n; i++){
            if(i == 1) continue;
            if(isPrime(i)) list.add(i);
        }
        Collections.sort(list);

        int sum = 0;
        for(int i=0; i<list.size(); i++)
            sum+=list.get(i);
        System.out.println(sum != 0 ? sum+"\n"+list.get(0) : "-1");
    }

    static boolean isPrime(int num){
        for(int i=2; i*i<=num; i++){
            if(num%i == 0) return false;
        }
        return true;
    }
}