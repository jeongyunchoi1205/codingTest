import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        answer = sides[1] - (sides[1] - sides[0]);
        answer += sides[1] + sides[0] - sides[1] -1;
        return answer;
    }
}