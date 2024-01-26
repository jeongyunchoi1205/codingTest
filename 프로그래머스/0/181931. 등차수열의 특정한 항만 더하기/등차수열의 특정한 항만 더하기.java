class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] list = new int[included.length];
        list[0] = a;
        for(int i=1; i<included.length; i++){
            list[i] = d + list[i-1];
        }
        for(int i=0; i<included.length; i++){
            if(included[i]==true){
                answer+=list[i];
            }
        }
        return answer;
    }
}