import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String input = br.readLine().toLowerCase().replaceAll(" ","");
            if(input.equals("#")) break;
            String s = Character.toString(input.charAt(0));
        
            int cnt=0;
            for(int i=1; i<input.length(); i++){
                if(s.equals(Character.toString(input.charAt(i)))) cnt++;
            }
            System.out.println(s+" "+cnt);
        }
    }
}