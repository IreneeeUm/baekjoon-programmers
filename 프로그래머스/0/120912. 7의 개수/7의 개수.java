class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str = "";
        for(int num : array){
            str += "" + num;
        }
        answer = str.length() - str.replaceAll("7", "").length();
        return answer;
    }
}