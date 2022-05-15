import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<priorities.length; i++)
            que.add(priorities[i]);
        
        while (true) {
            if(que.isEmpty()) break;
            for (int i = 0; i < priorities.length; i++) {
                if (que.peek() == priorities[i]) {
                    answer++;
                    if (i == location) {
                        return answer;
                    }
                    que.poll();
                }
            }
        }
        return answer;
    }
}