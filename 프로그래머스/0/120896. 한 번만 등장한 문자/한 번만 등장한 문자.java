import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split("");
        
        for(String str : strArr){
            if(s.indexOf(str) == s.lastIndexOf(str)){
                answer += str;
            }
        }
        
        if(answer.length() > 0){
            String[] ansArr = answer.split("");
            Arrays.sort(ansArr);
            answer = String.join("", ansArr);
        }
        
        return answer;
    }
}