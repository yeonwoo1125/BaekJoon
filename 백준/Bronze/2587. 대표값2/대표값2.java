import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];
        for(int i=0; i<5; i++)
            arr[i] = Integer.parseInt(br.readLine());
        Arrays.sort(arr);

        int s = 0;
        for(int i=0; i<5; i++)
            s+=arr[i];
        System.out.println(s/5);
        System.out.println(arr[2]);
    }
}