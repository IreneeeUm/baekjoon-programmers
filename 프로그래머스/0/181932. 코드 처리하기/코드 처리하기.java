class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        String[] strArr = code.split("");
        for(int i=0; i<strArr.length; i++){
            if("1".equals(strArr[i])){
                mode = (mode == 0) ? 1 : 0;
            } else {
                if(mode == 0){
                    if(i % 2 == 0){
                        answer += strArr[i];
                    }
                } else {
                    if(i % 2 != 0){
                        answer += strArr[i];
                    }
                }
            }
        }
        return answer.equals("") ? "EMPTY" : answer;
    }
}