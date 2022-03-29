import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            String[] arr = br.readLine().split(" ");
            arr[0]="god";
            for(int j=0; j<arr.length; j++)
                System.out.print(arr[j]);
            System.out.println();
        }
    }
}