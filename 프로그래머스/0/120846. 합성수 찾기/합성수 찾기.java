class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 0;
        for(int i = 1; i <= n; i++){
            num=0;
            for(int j = 1; j<=n; j++){
                if(i%j==0){
                    num++;
                }//if
            }//내부 for
            if(num>=3){
                answer++;
            }
        }
        return answer;
    }
}