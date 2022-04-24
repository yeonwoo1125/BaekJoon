import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            String a = sc.next();
            String b = sc.next();
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0; j<a.length(); j++){
                int anum = a.charAt(j)-'A';
                int bnum = b.charAt(j)-'A';

                if(bnum >= anum) list.add(bnum-anum);
                else list.add(bnum+26-anum);
            }
            System.out.print("Distances: ");
            for(int j=0; j<list.size(); j++)
                System.out.print(list.get(j)+" ");
            System.out.println();
        }
    }
}