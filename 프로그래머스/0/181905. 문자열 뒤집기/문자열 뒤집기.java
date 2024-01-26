class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String str = my_string.substring(s, e+1);
        String pre = my_string.substring(0, s);
        String after = my_string.substring(e+1);
        StringBuilder build = new StringBuilder(str);
        String mid = build.reverse().toString();
        answer = pre + mid + after;
        return answer;
    }
}