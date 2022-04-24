import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        while(true){
            
            int a = sc.nextInt();
            String b = sc.next();
            if(b.equals("E")) break;
            int c = sc.nextInt();
            boolean flag = false;
            switch(b){
                case ">" : 
                    if(a > c) flag = true; 
                    break;
                case ">=" :
                    if(a>=c) flag = true;
                    break;
                case "<" :
                    if(a<c) flag = true;
                    break;
                case "<=" : 
                    if(a<=c) flag = true;
                    break;
                case "==" : 
                    if(a == c) flag = true;
                    break;
                case "!=" :
                    if(a != c) flag =true;
                    break;
                    
            }
            System.out.println("Case "+ ++cnt +": "+flag);
        }
    }
}