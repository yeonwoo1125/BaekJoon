import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for(int i=0; i<str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))) System.out.print(String.valueOf(str.charAt(i)).toLowerCase());
            else System.out.print(String.valueOf(str.charAt(i)).toUpperCase());
        }
    }
}