class Solution {
    public int solution(int order) {
        int answer = 0;
        String orderCount = String.valueOf(order);
        for(int i=0; i<orderCount.length(); i++){
            if(orderCount.charAt(i) == '3' || orderCount.charAt(i) =='6' || orderCount.charAt(i) =='9') {
                answer++;
            }
        }
        return answer;
    }
}