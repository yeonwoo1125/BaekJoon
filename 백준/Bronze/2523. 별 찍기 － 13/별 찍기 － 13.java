import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++)
                System.out.print('*');
            System.out.println();
        }
        for(int i=1; i<n; i++){
            for(int j=i; j<n; j++)
                System.out.print('*');
            System.out.println();
        }
    }
}