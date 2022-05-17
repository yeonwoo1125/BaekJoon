import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		for(int i=a;i>=1;i--){
			for(int j=a-i;j>0;j--){
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--){
				System.out.print("*");
			}
			System.out.println();
		}
    }
}