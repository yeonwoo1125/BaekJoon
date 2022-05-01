import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String people = sc.next();
        String[][] list = new String[n][2];

        String answer = "";
        for(int i=0; i<n; i++){
            for(int j=0; j<list[i].length; j++)
                list[i][j] = sc.next();
        }
        
        for(int i=0; i<n; i++){
            if(list[i][0].equals(people)) answer = list[i][1];
        }
        int cnt = 0;
        for(int i=0; i<n; i++){
            if(list[i][1].equals(answer) && list[i][0].equals(people)) break;
            if(list[i][1].equals(answer) && !list[i][0].equals(people)) cnt++;   
        }
        System.out.println(cnt);
    }
}