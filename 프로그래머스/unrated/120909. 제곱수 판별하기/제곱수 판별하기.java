class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 1;
        while(n - (i*i)>=0){
            if(n - (i*i)==0){
                answer = 1;
            }else{
                answer = 2;
            }
            i++;
        }
        return answer;
    }
}