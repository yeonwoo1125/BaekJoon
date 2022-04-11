import java.io.*;
class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toLowerCase().replace(" ","");

        while(!input.equals("#")){
            int cnt = 0;
            for(int i=0; i<input.length(); i++){
                if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u')
                    cnt++;
            }
            System.out.println(cnt);
            input = br.readLine().toLowerCase().replace(" ","");
        }
        
    }
}