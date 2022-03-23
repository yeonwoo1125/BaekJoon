import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        //min
        if(a.contains("6")){
            a = a.replace("6","5");
        }
        if(b.contains("6")){
            b = b.replace("6","5");
        }
        int min = Integer.parseInt(a) + Integer.parseInt(b);

        //max
        if(a.contains("5")){
            a = a.replace("5","6");
        }
        if(b.contains("5")){
            b = b.replace("5","6");
        }
        int max = Integer.parseInt(a) + Integer.parseInt(b);

        System.out.print(min+" "+max);
    }
}
