import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int loc=0;
        for(int i=0; i<5; i++){
            int sum = 0;
            for(int j=0; j<4; j++){
                sum+=sc.nextInt();
            }
            if(max<sum){
                loc = i+1;
                max = sum;
            }
        }
       
        System.out.println(loc+" "+max);
    }
}