import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];

        int out = sc.nextInt();
        int in = sc.nextInt();
        arr[0] = in - out;
        for(int i=1; i<4; i++){
            out = sc.nextInt();
            in = sc.nextInt();
            arr[i] = arr[i-1] - out + in;
        }
        Arrays.sort(arr);
        System.out.println(arr[3]);
    }
}