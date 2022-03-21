import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        long a =1;
        if(input == 0){
            System.out.println("1");
            return ;
        }
        for(int i=input;i>=1; i--){
            a*=i;
        }
        System.out.println(a);
    }
}