import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for(int j=0; j<queries.length; j++){
            int s = queries[j][0];
            int e = queries[j][1];
            int k = queries[j][2];
            int num = Integer.MAX_VALUE;
            
            for(int i=0; i<arr.length; i++){
                if(i>=s && i<=e){
                    if(arr[i]>k && arr[i]<num){
                        num = arr[i];
                    }
                }
            }
            
            if (num == Integer.MAX_VALUE) {
                answer[j] = -1;
            } else {
                answer[j] = num;
            }
        }
        return answer;
    }
}