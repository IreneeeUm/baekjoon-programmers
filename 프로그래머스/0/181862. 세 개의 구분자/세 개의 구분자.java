class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        myStr = myStr.replaceAll("[abc]", " ");
        int num = 0;
        String[] strArr = myStr.split(" ");
        
        for(int i = 0; i < strArr.length; i++){
            if("".equals(strArr[i])){
                num++;
            }
        }
        
        if(num == strArr.length){
            answer = new String[]{"EMPTY"};
        } else {
            answer = new String[strArr.length-num];
            int cnt = 0;
            for(int i=0; i<strArr.length; i++){
                if(!"".equals(strArr[i])){
                    answer[cnt] = strArr[i];
                    cnt++;
                }
            }
        }
        
        return answer;
    }
}