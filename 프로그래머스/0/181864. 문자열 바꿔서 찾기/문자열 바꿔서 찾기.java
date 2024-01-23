class Solution {
    public int solution(String myString, String pat) {
        String my_string = "";
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i)=='A'){
                my_string += "B";
            }else{
                my_string +="A";
            }
        }
        return (my_string.contains(pat))?1:0;
    }
}