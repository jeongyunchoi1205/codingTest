class Solution {
    public String solution(int age) {
        String answer = "";
        String[] ageArr = String.valueOf(age).split("");
        String age960 = "abcdefghij";
        
        for(int i=0; i<ageArr.length; i++){
            answer += age960.charAt(Integer.parseInt(ageArr[i]));
        }
        return answer;
    }
}