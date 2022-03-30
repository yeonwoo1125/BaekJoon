import java.io.*;

class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String ucpc = "UCPC";
        int index = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ucpc.charAt(index)) index++;
            if(index == 4) {
                System.out.println("I love UCPC");
                return ;
            }
        }
        System.out.println("I hate UCPC");
    }
}