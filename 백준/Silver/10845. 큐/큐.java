import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> que = new LinkedList<>();
        
        int last = 0;
        for(int i=0; i<n; i++){
            String[] cmd = br.readLine().split(" ");
            
            switch(cmd[0]){
                case "push" : 
                    que.add(Integer.parseInt(cmd[1])); 
                    last = Integer.parseInt(cmd[1]);  
                    break;
                case "pop" : System.out.println(que.isEmpty() ? "-1" : que.remove()); break;
                case "size" : System.out.println(que.size()); break;
                case "empty" : System.out.println(que.isEmpty() ? "1" : "0"); break;
                case "front" : System.out.println(que.isEmpty() ? "-1" : que.peek()); break;
                case "back" : System.out.println(que.isEmpty() ? "-1" : last ); break;
            }
        }
    }
}