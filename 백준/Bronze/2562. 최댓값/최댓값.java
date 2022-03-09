import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];

        for(int i=0; i<9; i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        int max = arr[0];
        int loc = 0;
        for(int i=0; i<9; i++){
            if(max<arr[i]){
                max = arr[i];
                loc = i;
            } 
        }
        System.out.println(max);
        System.out.println(loc+1);
    }
}