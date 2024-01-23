import java.util.*;
class Solution {
    public List<Integer> solution(String myString) {
        String[] my_string = myString.split("x");
        List<Integer> answer = new ArrayList<>();
        for(int i=0; i<my_string.length; i++){
            answer.add(my_string[i].length());
        }
        if(myString.charAt(myString.length()-1)=='x'){
            answer.add(0);
        }
        return answer;
    }
}