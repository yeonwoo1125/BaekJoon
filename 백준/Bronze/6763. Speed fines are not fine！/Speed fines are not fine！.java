import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int limit = Integer.parseInt(br.readLine());
        int speed = Integer.parseInt(br.readLine());

        int money = 0;
        if(limit >= speed) System.out.println("Congratulations, you are within the speed limit!");
        else  {
            if(speed - limit <=20) money = 100;
            else if(speed - limit <=30) money = 270;
            else money = 500;

            System.out.println("You are speeding and your fine is $"+money+".");
        }
        
    }
}