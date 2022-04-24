import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            String input = br.readLine();
            System.out.println(Character.toString(input.charAt(0)).toUpperCase()+input.substring(1));
        }
    }
}
