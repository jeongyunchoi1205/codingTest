class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        for(int i=0; i<queries.length; i++){
            int a = queries[i][0];
            int b = queries[i][1];
            
            for(int j=a; j<=b; j++){
               arr[j] = arr[j] +1;
            }
        }
        return arr;
    }
}