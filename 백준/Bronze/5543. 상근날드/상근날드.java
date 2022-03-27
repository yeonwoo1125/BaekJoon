import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int burger = Integer.parseInt(br.readLine());
        

        for(int i=0; i<2; i++){
            int b = Integer.parseInt(br.readLine());
            if(burger > b) burger = b;
        }
        
        int drink = Integer.parseInt(br.readLine());
        for(int i=0; i<1; i++){
            int d = Integer.parseInt(br.readLine());
            if(drink > d) drink = d;
        }

        System.out.print(burger+drink-50);
    }
}