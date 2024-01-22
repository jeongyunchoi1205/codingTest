class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        if(names.length%5==0){
        answer = new String[names.length/5];
        }else if(names.length%5!=0){
            answer = new String[names.length/5 +1];
        }
        int j = 0;
        for(int i=0; i<names.length; i+=5){
            answer[j++] = names[i];
        }
        return answer;
    }
}