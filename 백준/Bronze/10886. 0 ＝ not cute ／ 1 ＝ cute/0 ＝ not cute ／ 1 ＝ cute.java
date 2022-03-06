import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        
        int chk=0;
        for(int i=0; i<input; i++){
            int vote = Integer.parseInt(br.readLine());
            if(vote == 0) chk++;
            else chk--;
        }
        if(chk>0) System.out.println("Junhee is not cute!");
        else System.out.println("Junhee is cute!");
            
        
    }
}