import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=1; i<=b; i++){
            for(int j=1; j<=i; j++){
                list.add(i);
            }
        }
        int sum=0;
        for(int i=a; i<=b; i++)
            sum+=list.get(i-1);
          
        System.out.println(sum);
    }
}