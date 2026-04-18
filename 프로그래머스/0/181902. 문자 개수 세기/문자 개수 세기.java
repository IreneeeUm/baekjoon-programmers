class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (char ch : my_string.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') { 
                // 대문자라면 0~25 위치에 저장
                answer[ch - 'A']++;
            } else if (ch >= 'a' && ch <= 'z') {
                // 소문자라면 26~51 위치에 저장
                answer[ch - 'a' + 26]++;
            }
        }
        return answer;
    }
}