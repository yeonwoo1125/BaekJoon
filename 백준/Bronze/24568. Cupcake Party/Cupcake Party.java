import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int r = Integer.parseInt(br.readLine());
        int s = Integer.parseInt(br.readLine());

        System.out.println((r*8 + s*3) - 28);
    }
}