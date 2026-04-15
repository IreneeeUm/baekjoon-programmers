import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length);
        
        for(int[] query : queries){
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            for(int i=s; i<=e; i++){
                if(k == 0){
                    if(i == 0) answer[i]++;
                } else {
                    if(i % k == 0) answer[i]++;
                }
            }
        }
        
        return answer;
    }
}