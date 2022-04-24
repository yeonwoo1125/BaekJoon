import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        

        while(true){
            int n = sc.nextInt();
            if(n == 0) break;

            Stack<Integer> stack = new Stack<>();
            for(int i=0; i<n; i++){
                int a = sc.nextInt();
                if(stack.isEmpty()) stack.push(a);
                if(stack.peek() != a) stack.push(a);
            }

            for(int i=0; i<stack.size(); i++)
                System.out.print(stack.get(i)+" ");
            System.out.println("$");
        }
    }
}