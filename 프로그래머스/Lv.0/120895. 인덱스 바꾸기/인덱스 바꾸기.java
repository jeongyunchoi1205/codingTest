class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            if(i!=num1 && i!=num2){
                answer += String.valueOf(my_string.charAt(i));
            }else if(i ==num1){
                answer += String.valueOf(my_string.charAt(num2));
            }else if(i == num2){
                answer += String.valueOf(my_string.charAt(num1));
            }
        }
        return answer;
    }
}