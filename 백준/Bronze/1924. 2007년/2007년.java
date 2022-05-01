import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); 
        int y = sc.nextInt(); 

        int[] month = {31,28,31,30,31,30,31,31,30,31,30,31}; 
        String[] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"}; 

        int day = y; 
        for(int i = 0; i < x-1; i++) { 
            day += month[i]; 
        }

        System.out.println(days[day%7]); // 요일 출력


    }
}