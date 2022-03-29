import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().substring(0, 3);
        System.out.println(str.equals("555") ? "YES" : "NO");
        
    }
}