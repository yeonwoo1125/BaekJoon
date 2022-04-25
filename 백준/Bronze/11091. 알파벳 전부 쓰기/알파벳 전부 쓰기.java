import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++){
            String input = br.readLine().toLowerCase();
            String answer = "";
            int[] arr = new int[26];
            for(int j=0; j<input.length(); j++){
                if(input.charAt(j)>='a' && input.charAt(j)<='z')
                    arr[input.charAt(j)-'a']++;
                else continue;
            }
            for(int j=0; j<26; j++){
                if(arr[j] == 0) answer+=Character.toString(j+'a');
            }
            System.out.println(answer.equals("") ? "pangram" : "missing "+answer);
        }
    }
}