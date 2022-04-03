import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i=0; i<n; i++){
            String[] cmd = br.readLine().split(" ");

            switch(cmd[0]){
                case "push_front": deque.addFirst(Integer.parseInt(cmd[1])); break;
                case "push_back" : deque.addLast(Integer.parseInt(cmd[1])); break;
                case "pop_front" : System.out.println(deque.isEmpty() ? "-1" : deque.removeFirst()); break;
                case "pop_back" : System.out.println(deque.isEmpty() ? "-1" : deque.removeLast()); break;
                case "size" : System.out.println(deque.size()); break;
                case "empty" : System.out.println(deque.isEmpty() ? "1" : "0"); break;
                case "front" : System.out.println(deque.isEmpty() ? "-1" : deque.getFirst()); break;
                case "back" :System.out.println(deque.isEmpty() ? "-1" : deque.getLast()); break;
            }
        }
    }
}