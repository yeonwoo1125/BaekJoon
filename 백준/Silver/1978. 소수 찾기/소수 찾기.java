import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }

        int count = 0;
        for(int i=0; i<n; i++){
            int num = list.get(i);
            int cnt = 0;
            if(num == 1) continue;
            for(int j=2; j<num; j++){
                if(num%j == 0){
                    cnt++;
                } 
            }
            if(cnt == 0) count++;
            
        }
        System.out.println(count);
    }
}