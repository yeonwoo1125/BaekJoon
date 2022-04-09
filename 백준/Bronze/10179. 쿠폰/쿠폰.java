import java.io.*;
class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            double p = Double.parseDouble(br.readLine());
            System.out.printf("$%.2f\n",Math.round(p*80/100*100)/100.0);
        }
    }
}