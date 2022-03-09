import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<Double>();

        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            list.add(sc.nextDouble());
        }
        sc.close();
        double max = Collections.max(list);
        double score = 0;
        
        for(int i=0; i<n; i++){
            score+=(list.get(i)/max)*100;
        }
        System.out.println(score/n);
    }
}