import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int chk = 0;
        for(int i=0; i<n; i++){
            if(str.charAt(i) == 'A') chk++;
            else chk--;
        }
        if(chk == 0) System.out.println("Tie");
        else if(chk > 0) System.out.println("A");
        else System.out.println("B");
    }
}