import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> intLst = new ArrayList<>();
        
        for(int i = 2; i <= n; i++){
            if(n % i == 0){
                while(n % i == 0){
                    n /= i;
                }
                intLst.add(i);
            }
        }
        
        int[] answer = new int[intLst.size()];
        
        for(int i = 0; i < intLst.size(); i++){
            answer[i] = intLst.get(i);
        }
        
        return answer;
    }
}