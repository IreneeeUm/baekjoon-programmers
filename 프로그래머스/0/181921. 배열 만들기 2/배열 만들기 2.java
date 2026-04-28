import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> lst = new ArrayList<>();
        
        for(int i=l; i<=r; i++){
            int num = i;
            boolean isValid = true;
            
            while(num > 0){
                int digit = num % 10;
                if(digit != 0 && digit != 5){
                    isValid = false;
                    break;
                }
                num /= 10;
            }
            
            if(isValid){
                lst.add(i);
            }
        }
        if(lst.isEmpty()) return new int[]{-1};
        
        int[] answer = new int[lst.size()];
        for(int i=0; i<lst.size(); i++){
            answer[i] = lst.get(i);
        }
        return answer;
    }
}