import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String find = br.readLine();
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        for(int i=0; i<n; i++){
            String str = br.readLine();
            str += str;
            if(str.contains(find)) cnt++;
        }
        System.out.println(cnt);
    }
}