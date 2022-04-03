import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<n; i++){
            String[] cmd = br.readLine().split(" ");

            switch(cmd[0]){
                case "push" : stack.push(Integer.parseInt(cmd[1])); break;
                case "top" : System.out.println(stack.size() == 0 ? "-1" : stack.peek()); break;
                case "size" : System.out.println(stack.size()); break;
                case "empty" : System.out.println(stack.empty() ? "1" : "0"); break;
                case "pop" : System.out.println(stack.size() == 0 ? "-1" : stack.pop()); break;
            }
        }
    }
}