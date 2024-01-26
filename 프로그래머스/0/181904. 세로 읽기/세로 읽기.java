import java.util.*;
class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        List<String> str = new ArrayList<>();
        int j = 0;
        for(int i = 0; i<my_string.length()/m; i++){
            str.add(my_string.substring(j, j+=m));
        }
        for(int i=0; i<str.size(); i++){
            answer+= str.get(i).substring(c-1, c);
        }
        return answer;
    }
}