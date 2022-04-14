import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String input = br.readLine();
            if(input.equals("***")) break;
            StringBuilder sb = new StringBuilder(input);
            System.out.println(sb.reverse());
        }
        
    }
}