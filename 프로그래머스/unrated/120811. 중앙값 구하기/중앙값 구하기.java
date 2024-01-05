import java.util.*;
import java.util.ArrayList;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
       
         List<Integer> list = new ArrayList();
        for(int i=0; i<array.length; i++){
            list.add(array[i]);
        }
        list.sort(Comparator.naturalOrder());
        
        answer =  list.get(list.size()/2);
        
        return answer;
    }
}