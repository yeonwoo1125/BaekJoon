import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n == 0) break;
            HashMap<String, String> hashmap = new HashMap<>();
            for(int i=0; i<n; i++){
                String str = sc.next();
                hashmap.put(str.toUpperCase(),str );
            }
            Object[] mapkey = hashmap.keySet().toArray();
            Arrays.sort(mapkey);
            System.out.println(hashmap.get(mapkey[0]));
            hashmap.clear();
        }
    }
}