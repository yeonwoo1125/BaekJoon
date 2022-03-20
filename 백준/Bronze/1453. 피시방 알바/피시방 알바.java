import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        int cnt = 0;
        for(int i=0; i<n; i++){
            int sit = sc.nextInt();
            if(list.contains(sit)) cnt++;
            else list.add(sit);
        }
        System.out.println(cnt);
    }
}