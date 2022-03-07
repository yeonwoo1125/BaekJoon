import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++){
            String[] input = br.readLine().split(" ");
            for(int j=0; j<input.length; j++){
                System.out.print(new StringBuilder().append(input[j]).reverse().toString()+" ");
            }
            System.out.println();
        }
        
        
        
        
    }
}