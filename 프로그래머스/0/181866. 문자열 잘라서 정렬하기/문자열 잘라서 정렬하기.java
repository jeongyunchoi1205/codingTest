import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        List<String> result = new ArrayList<>();
        for(int i=0; i<answer.length; i++){
            if(!answer[i].isEmpty()){
                result.add(answer[i]);
            }
        }
        String[] answerArr = result.toArray(new String[0]);
        Arrays.sort(answerArr);
        return answerArr;
    }
}