import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        System.out.println(solution(arr,n,m));
    }
    static int solution(int arr[],int n,int m){
        int res = 0;
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    int tmp = arr[i]+arr[j]+arr[k];

                    if(tmp == m) return tmp;
                    else if(res < tmp && m>tmp) res = tmp;
                }
            }
        }
        return res;
    }
}