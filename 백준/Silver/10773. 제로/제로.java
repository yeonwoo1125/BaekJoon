import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> s = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0) s.pop();
            else s.push(num);
            
        }
        int sum = 0;
        for(int i=0; i<s.size(); i++)
            sum+=s.get(i);
    
        System.out.println(sum);
            
    }
}