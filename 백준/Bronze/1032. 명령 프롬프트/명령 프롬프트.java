import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();
        String answer = "";
        
        for(int i=0; i<n; i++)
            list.add(br.readLine());
        
        for(int i=0; i<list.get(0).length(); i++){
            boolean chk = false;
            for(int j=1; j<n; j++){
                if(list.get(j-1).charAt(i) != list.get(j).charAt(i)){
                    chk = true;
                    break;
                }
            }
            if(chk) answer+="?";
            else answer+=list.get(0).charAt(i);
        }
        System.out.println(answer);
    }
}