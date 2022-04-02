import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            ArrayList<Integer> list = new ArrayList<>();
            int num = sc.nextInt();
            for(int j=0; j<num; j++){
                list.add(sc.nextInt());
            }
            Collections.sort(list,Collections.reverseOrder());
            int lg = list.get(0)-list.get(1);
            for(int j=1; j<num; j++){
                if(lg < list.get(j-1) - list.get(j)) lg = list.get(j-1) - list.get(j);
            }
            System.out.println("Class "+(i+1));
            System.out.println("Max "+list.get(0)+", Min "+list.get(list.size()-1)+", Largest gap "+ lg);
            
        }
    }
}