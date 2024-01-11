class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(int i=0; i<rsp.length(); i++){
            String str = String.valueOf(rsp.charAt(i));
            if(str.equals("2")){
                answer += "0";
            }
            if(str.equals("0")){
                answer += "5";
            }

            if(str.equals("5")){
                answer += "2";
            }
        }
        return answer;
    }
}