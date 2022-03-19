import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i=0; i<2; i++){
            arr[0] = sc.nextInt()*6;
            arr[1] = sc.nextInt()*3;
            arr[2] = sc.nextInt()*2;
            arr[3] = sc.nextInt();
            arr[4] = sc.nextInt()*2;

            int sum = 0;
            for(int j=0; j<5; j++){
                sum+=arr[j];        
                arr[j]=0;
            }
            System.out.print(sum+" ");
        }
    }
}
