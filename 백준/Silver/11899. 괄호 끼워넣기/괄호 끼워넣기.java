import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Stack<Character> stack = new Stack<>();

        int cnt = 0;
        for(int i=0; i<input.length(); i++){
            char c = input.charAt(i);
            if(c == '('){
                stack.push(c);
            }
            else {
                if(stack.isEmpty()) cnt++;
                else stack.pop();
            }
        }
        cnt += stack.size();
        System.out.println(cnt);
    }
}