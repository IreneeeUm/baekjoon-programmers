import java.util.Arrays;
class Solution {
    public long solution(long n) {
        String lstr = ""+n;
        String[] lArr = lstr.split("");
        Arrays.sort(lArr);
        lstr = "";
        for(int i=lArr.length-1; i>=0; i--){
            lstr += ""+lArr[i];
        }
        long answer = Long.parseLong(lstr);
        return answer;
    }
}