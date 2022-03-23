import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<k; i++){
            StringBuffer sb = new StringBuffer(String.valueOf((i+1)*n));
            list.add(Integer.parseInt(sb.reverse().toString()));
        }

        Collections.sort(list);
        System.out.print(list.get(list.size()-1));
    }
}