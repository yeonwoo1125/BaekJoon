import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);

        System.out.println(list.get(list.size()-1) - list.get(0));
    }
}