class Solution {
    public String[] solution(String my_str, int n) {
        int len = (my_str.length() + n - 1) / n;
        String[] answer = new String[len];
        int start = 0, end = n;
        for(int i = 0; i < len; i++){
            answer[i] = my_str.substring(start, end);
            start += n;
            if(end + n > my_str.length()){
                end = my_str.length();
            } else {
                end += n;
            }
        }
        return answer;
    }
}