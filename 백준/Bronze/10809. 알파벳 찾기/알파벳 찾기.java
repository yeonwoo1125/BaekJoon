import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int[] arr = new int[26];
        for(int i=0; i<26; i++)
           arr[i]=-1;
            
        for(int i=0; i<input.length(); i++){
            arr[input.charAt(i)-'a'] = input.indexOf(input.charAt(i));
            
        }
        for(int i=0; i<26; i++)
            System.out.print(arr[i]+" ");
    }
}