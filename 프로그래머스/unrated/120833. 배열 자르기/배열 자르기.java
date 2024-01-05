import java.util.*;

class Solution {
    public List<Integer> solution(int[] numbers, int num1, int num2) {
        List<Integer> answer = new ArrayList();
        for(int i=0; i<numbers.length; i++){
            if(i>=num1 && i<=num2){
                answer.add(numbers[i]);
            }
        }
        return answer;
    }
}