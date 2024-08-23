class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a == b){
            answer = Long.valueOf(a);
        } else if(b > a) {
            for(int i=a; i<=b; i++){
                answer += Long.valueOf(i);
            }
        } else if(a > b) {
            for(int i=b; i<=a; i++){                
                answer += Long.valueOf(i);
            }
        }
        return answer;
    }
}