class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int sum = 0;
        int x2 = x;
        boolean a = true;
        
        while(a){
            sum += x2 % 10 ;
            x2 /= 10;
            if(x2 == 0) a = false;
        }
        
        answer = (x % sum == 0) ? true : false;
        return answer;
    }
}