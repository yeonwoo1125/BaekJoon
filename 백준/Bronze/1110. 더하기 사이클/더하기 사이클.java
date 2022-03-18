import java.io.*;

class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int cnt = 0;
        if(input.length() == 1){
            input="0"+input;
        }
        String[] arr = input.split("");
        while(true){
            cnt++;
            String tmp = ""+(Integer.parseInt(arr[0])+Integer.parseInt(arr[1]));
            arr[0] = arr[1];
            arr[1] = Character.toString(tmp.charAt(tmp.length()-1));
            String str = arr[0] + arr[1];
            if(Integer.parseInt(str) == Integer.parseInt(input)) break;
        }
        System.out.println(cnt);
    }
}