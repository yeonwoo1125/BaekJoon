import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<7; i++){
            int a = sc.nextInt();
            if(a%2 == 1) list.add(a);
        }
        if(list.size() == 0) {
            System.out.println("-1");
            return ;
        }
        Collections.sort(list);
        int sum = 0;
        for(int i=0; i<list.size(); i++)
            sum+=list.get(i);
        System.out.println(sum);
        System.out.println(list.get(0));
        
    }
}