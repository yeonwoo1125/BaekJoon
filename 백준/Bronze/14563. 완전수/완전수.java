import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
            
        sc.close();
        
        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=1; j<=arr[i]/2; j++){
                if(arr[i]%j == 0) sum+=j;
            }
            if(sum == arr[i]) System.out.println("Perfect");
            else if(sum>arr[i]) System.out.println("Abundant");
            else System.out.println("Deficient");
        }
    }
}