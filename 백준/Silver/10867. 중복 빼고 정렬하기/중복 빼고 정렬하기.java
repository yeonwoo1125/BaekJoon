import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            int input = sc.nextInt();
            if(!list.contains(input)) list.add(input);
        }
        Collections.sort(list);
        for(int val : list)
            System.out.print(val+" ");
    }
}