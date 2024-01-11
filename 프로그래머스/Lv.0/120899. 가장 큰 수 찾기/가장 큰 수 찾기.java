import java.util.*;
class Solution {
    public int[] solution(int[] array) {
        int[] answer = {};
        answer = new int[2];
        int[] array2 = new int[array.length];
        for(int i=0; i<array.length; i++){
            array2[i] = array[i];
        }
        Arrays.sort(array2);
        answer[0] = array2[array2.length-1];
        
        for(int i=0; i<array.length; i++){
            if(array[i] == answer[0]){
                answer[1] = i;
            }
        }
        return answer;
    }
}