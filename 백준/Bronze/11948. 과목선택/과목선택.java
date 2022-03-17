import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] science = new int[4];
        int[] humanities = new int[2];

        for(int i=0; i<4; i++)
            science[i]=sc.nextInt();
        for(int i=0; i<2; i++)
            humanities[i]=sc.nextInt();

        Arrays.sort(science);
        Arrays.sort(humanities);

        int sum = humanities[1];
        for(int i=1; i<4; i++)
            sum+=science[i];
        System.out.println(sum);
    }
}