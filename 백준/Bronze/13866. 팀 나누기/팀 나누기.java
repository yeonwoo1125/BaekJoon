import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] skill = new int[4];
        for(int i=0; i<4; i++)
            skill[i] = sc.nextInt();

        Arrays.sort(skill);
        int t1 = skill[0]+skill[3];
        int t2 = skill[1]+skill[2];

        System.out.println(Math.abs(t1-t2));
    }
}