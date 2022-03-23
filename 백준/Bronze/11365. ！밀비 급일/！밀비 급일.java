import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String str = br.readLine();
            if(str.equals("END")) break;
            
            String[] arr = str.split(" ");
            
            for(int i=arr.length-1; i>=0; i--){
                StringBuffer sb = new StringBuffer(arr[i]);
                System.out.print(sb.reverse().toString()+" ");
            }
            System.out.println();
        }
        
    }
}