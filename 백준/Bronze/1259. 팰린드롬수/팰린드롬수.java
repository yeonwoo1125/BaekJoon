import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextInt()){
            int a = sc.nextInt();
            if(a == 0) break;
            int b = Integer.parseInt(new StringBuilder().append(a).reverse().toString());
            if(a == b) System.out.println("yes");
            
            else System.out.println("no");
        }
        sc.close();
    }
}