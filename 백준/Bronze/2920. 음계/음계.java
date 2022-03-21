import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        for(int i=0; i<8; i++){
            arr[i] = sc.nextInt();
        }
        String ment = "mixed";
        
        for(int i=0; i<7; i++){
            if(arr[i+1] == arr[i]+1) ment = "ascending";
            else if(arr[i+1] == arr[i]-1) ment = "descending";
            else{
                ment = "mixed";
                break;
            } 
        }
        System.out.println(ment);
    }
}