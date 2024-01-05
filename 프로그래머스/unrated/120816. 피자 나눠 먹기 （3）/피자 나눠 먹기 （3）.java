class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        while(answer/n<1){
            answer+=slice;
        }
        answer/=slice;
        return answer;
    }
}