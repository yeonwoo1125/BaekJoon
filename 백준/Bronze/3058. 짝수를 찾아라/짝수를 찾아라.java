import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            ArrayList<Integer> list = new ArrayList<>();
            int sum = 0;
            
            for(int j=0;j<7; j++){
                int a = sc.nextInt();
                if(a%2==0) list.add(a);  
            }

            Collections.sort(list);
            for(int j=0; j<list.size(); j++){
                sum+=list.get(j);
            }
            System.out.print(sum+" "+list.get(0)+"\n");
        }
    }
}