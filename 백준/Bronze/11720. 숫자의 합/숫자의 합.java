import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        
        String input = br.readLine();
        int sum = 0;
        for(int i=0; i<len; i++){
            sum+=Character.getNumericValue(input.charAt(i));
        }
        System.out.println(sum);
    }
}