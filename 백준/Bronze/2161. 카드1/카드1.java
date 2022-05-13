import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<n; i++){
            queue.add(i+1);
        }
        while(queue.size() != 0){
            System.out.print(queue.peek()+" ");
            queue.remove();
            queue.add(queue.peek());
            queue.remove();
        }
    }
}