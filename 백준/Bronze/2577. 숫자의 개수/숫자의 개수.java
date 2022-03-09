import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        String n = Integer.toString(sc.nextInt()*sc.nextInt()*sc.nextInt());
        sc.close();

        for(int i=0; i<n.length(); i++){
            char c = n.charAt(i);
            arr[Character.getNumericValue(c)]++;
        }

        for(int i=0; i<10; i++)
            System.out.println(arr[i]);
    }
}