import java.io.*;

class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++){
            String input = br.readLine().toLowerCase();
            StringBuilder sb = new StringBuilder(input);
            String re = sb.reverse().toString();
            System.out.println(re.equals(input) ? "Yes" : "No");
        }
    }
}