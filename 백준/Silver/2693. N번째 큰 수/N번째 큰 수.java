import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            for(int j=0; j<10; j++){
                list.add(sc.nextInt());
            }
            Collections.sort(list);
            System.out.println(list.get(7));
            list.clear();
        }
    }
}