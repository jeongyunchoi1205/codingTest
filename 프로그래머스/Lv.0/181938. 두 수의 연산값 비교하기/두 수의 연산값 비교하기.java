class Solution {
    public int solution(int a, int b) {
        String str = "" + a + b;
        int plus = 2 * a * b;
        int answer = (Integer.parseInt(str)>plus)?Integer.parseInt(str):plus;
        return answer;
    }
}