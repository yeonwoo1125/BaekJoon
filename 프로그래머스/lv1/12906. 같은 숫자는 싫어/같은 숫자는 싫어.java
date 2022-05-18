import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int a = 10;
        for(int n : arr) {
            if(a != n)
                list.add(n);
            a = n;
        }       
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i).intValue();
        }
        return answer;
    }
}