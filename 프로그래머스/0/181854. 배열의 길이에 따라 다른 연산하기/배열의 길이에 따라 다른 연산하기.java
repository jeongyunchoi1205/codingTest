class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = {};
        answer = new int[arr.length];
        if(arr.length%2==1){
            for(int i=0; i<arr.length; i++){
                if(i%2==0){
                    answer[i] = arr[i] + n;
                }else{
                    answer[i] = arr[i];
                }
            }
        }else if(arr.length%2==0){
            for(int i=0; i<arr.length; i++){
                if(i%2==0){
                    answer[i] = arr[i];
                }else{
                    answer[i] = arr[i] + n;
                }
            }
        }
        return answer;
    }
}