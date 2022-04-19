import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine().toLowerCase();
        while(!input.equals("#")){
            int cnt = 0;
            int arr[] = new int[26];
            for(int i=0; i<input.length(); i++)
                if(input.charAt(i) <='z' && input.charAt(i) >= 'a') arr[input.charAt(i)-'a']++;
            for(int i=0; i<arr.length; i++)
                if(arr[i] != 0) cnt++;
            System.out.println(cnt);
            input = br.readLine().toLowerCase();
        }
    }
}