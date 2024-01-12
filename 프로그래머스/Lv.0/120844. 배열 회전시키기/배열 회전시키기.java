class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        answer = new int[numbers.length];
        int temp = 0;
        if(direction.equals("right")){
            temp = numbers[numbers.length-1];
            for(int i = numbers.length-1; i>0; i--){
                answer[i] = numbers[i-1];
                answer[0] = temp;
            }
        }else{
            temp = numbers[0];
            for(int i= numbers.length-1; i>0; i--){
                answer[i-1] = numbers[i];
                answer[numbers.length-1] = temp;
            }
        }
        return answer;
    }
}