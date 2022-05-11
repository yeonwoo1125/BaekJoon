import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String name = br.readLine();

        int score = 0;
        for(int i=0; i<len; i++){
            score+= name.charAt(i)-'A'+1;
        }
        System.out.println(score);
    }
}