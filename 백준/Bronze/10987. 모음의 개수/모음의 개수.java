import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int cnt = 0;
        for(int i=0; i<input.length(); i++){
            String s = Character.toString(input.charAt(i));

            switch(s){
                case "a" : cnt++; break;
                case "e" : cnt++; break;
                case "i" : cnt++; break;
                case "o" : cnt++; break;
                case "u" : cnt++; break;
            }
        }

        System.out.println(cnt);
    }
}