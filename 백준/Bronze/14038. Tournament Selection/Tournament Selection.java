import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int w = 0;

        for(int i=1; i<=6; i++)
            if(br.readLine().equals("W")) w++;
        
        if(w>=5) System.out.println("1");
        else if(w>=3) System.out.println("2");
        else if(w>=1) System.out.println("3");
        else System.out.println("-1");
        
    }
}