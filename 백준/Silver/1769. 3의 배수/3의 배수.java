import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int cnt = 0;
        while(true){
            if(input.length() == 1) break;
            cnt++;
            String[] arr = new String[input.length()];
                arr = input.split("");
            int sum = 0;
            for(int i=0; i<arr.length; i++)
                sum+=Integer.parseInt(arr[i]);
            input = sum+"";
        }
         System.out.println(cnt);
        System.out.println(Integer.parseInt(input)%3 == 0 ? "YES" : "NO");
        
    }
}