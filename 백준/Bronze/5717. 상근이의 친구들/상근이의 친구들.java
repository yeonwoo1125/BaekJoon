import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            int b = sc.nextInt();
            int g = sc.nextInt();

            if(b == 0 && g == 0) break;
            System.out.println(b+g);
        }
            
    }
}