import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{100,100,200,200,300,300,400,400,500};

        boolean chkHacker = false;
        int s = 0;
        for (int i=0; i<9; i++){
            int a = sc.nextInt();
            if(a > arr[i]) {
                chkHacker = true;
                break;
            }
            s+=a;
        }

        if(chkHacker){
            System.out.println("hacker");
            return ;
        }
        if(s>=100){
            System.out.println("draw");
            return ;
        }
        System.out.println("none");
    }
}