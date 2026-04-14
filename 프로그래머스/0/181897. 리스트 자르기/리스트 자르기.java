import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        // slicer 의 값
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        // 배열을 자를 때 시작, 끝, 간격 값
        int start = 0;
        int end = num_list.length - 1;
        int step = 1;
        
        switch(n){
            case 1:
                end = b;
                break;
            case 2:
                start = a;
                break;
            case 3:
                start = a;
                end = b;
                break;
            case 4:
                start = a;
                end = b;
                step = c;
                break;
        }
        
        // 배열
        // 배열의 가변 길이 구하기
        int len = (n == 4) ? (end - start) / step + 1 : end - start + 1;
        int[] answer = new int[len];
        int j = 0;
        
        for(int i=start; i<=end; i+=step){
            answer[j++] = num_list[i];
        }
        
        
        // List
        List<Integer> list = new ArrayList<>();
        
        for(int i=start; i<=end; i+=step){
            list.add(num_list[i]);
        }
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}