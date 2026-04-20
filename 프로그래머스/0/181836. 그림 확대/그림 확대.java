import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int idx = 0;
        
        for(int i=0; i<picture.length; i++){
            StringBuilder sb = new StringBuilder();
            
            for(int j=0; j<picture[i].length(); j++){
                for(int t=0; t<k; t++){
                    sb.append(picture[i].charAt(j));
                }
            }
            String str = sb.toString();
            for(int rp=0; rp<k; rp++){
                answer[idx++] = str;
            }
        }
        
        return answer;
    }
}