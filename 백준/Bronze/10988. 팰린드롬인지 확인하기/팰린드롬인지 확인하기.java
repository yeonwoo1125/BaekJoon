import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        if(input.equals(new StringBuilder(input).reverse().toString())) System.out.println("1");
        else System.out.println("0");
        
    }
}