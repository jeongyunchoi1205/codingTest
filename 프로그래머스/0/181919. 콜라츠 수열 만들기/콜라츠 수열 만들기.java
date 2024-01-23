import java.util.*;
class Solution {
    public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();
        answer.add(n);
        while(n>0){
            if(n%2==0){
                answer.add(n/2);
                n/=2;
            }else{
                answer.add(3*n+1);
                n = 3*n + 1;
            }
            if(n ==1){
                break;
            }
        }
        return answer;
    }
}