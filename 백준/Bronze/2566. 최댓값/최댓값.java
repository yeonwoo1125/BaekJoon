import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[9][9];

        int row = 0, col = 0;
        for(int i=0; i<9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<9; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int max = arr[0][0];
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(max < arr[i][j]){
                    row = i+1;
                    col = j+1;
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
        System.out.println(row+" "+col);
    }
}