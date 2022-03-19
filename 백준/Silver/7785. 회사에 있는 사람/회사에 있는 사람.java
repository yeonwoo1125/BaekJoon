import java.util.*;
import java.util.Map.Entry;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, String> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        
        for(int i=0; i<n; i++)
            map.put(sc.next(), sc.next());
        
        Set set = map.entrySet(); 
        Iterator iterator = set.iterator(); 
    
        while(iterator.hasNext()){ 
            Entry<String,String> entry = (Entry)iterator.next(); 
            String key = (String)entry.getKey(); 
            String val = (String) entry.getValue();
            if(val.equals("enter"))
                list.add(key);
        }

        Collections.sort(list, Collections.reverseOrder());
        for(int i=0; i<list.size(); i++)
            System.out.println(list.get(i));
    }
}