import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> lst = new ArrayList<>();
        for (int num : arr) {
            lst.add(num);
        }
        
        for(int i=0; i<query.length; i++){
            if(i % 2 == 0){
                lst.subList(query[i]+1,lst.size()).clear();
            } else {
                lst.subList(0,query[i]).clear();
            }
        }
        
        int[] answer = new int[lst.size()];
        for(int i=0; i<lst.size(); i++){
            answer[i] = lst.get(i);
        }
        return answer;
    }
}