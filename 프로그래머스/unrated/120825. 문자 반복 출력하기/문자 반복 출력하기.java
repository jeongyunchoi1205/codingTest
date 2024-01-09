import java.util.*;
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        List<Character> list = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++){
            list.add(my_string.charAt(i));
        }

        for(int i=0; i<list.size(); i++){
            for(int j=1; j<=n; j++){
               answer += list.get(i);
            }
        }
        return answer;
    }
}