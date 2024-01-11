import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        String my_string2 = "";
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i)>='0' && my_string.charAt(i)<='9'){
               my_string2 += my_string.charAt(i);
            }
        }
        answer = new int[my_string2.length()];
        for(int i=0; i<my_string2.length(); i++){
            answer[i] = Character.getNumericValue(my_string2.charAt(i));
        }
        Arrays.sort(answer);
        return answer;
    }
}