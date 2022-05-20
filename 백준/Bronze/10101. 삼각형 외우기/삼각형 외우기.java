import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String answer = "";
        if(a+b+c == 180){
            if(a==60 && b==60 && c==60){
                answer = "Equilateral";
            }
            else if(a==b ||a==c || a==b || b==c){
                answer = "Isosceles";
            }
            else {
                answer = "Scalene";
            }
        }
        else answer = "Error";

        System.out.println(answer);
    }
}