class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0; i<signs.length; i++){
            if(!signs[i]) absolutes[i] *= -1;
        }
        for(int a : absolutes)
            answer+=a;
        return answer;
    }
}