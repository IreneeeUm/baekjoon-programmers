/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
    
        // 첫번째 라인의 데이터 수와 질의 수
        int suNo = Integer.parseInt(st.nextToken());
        int quizNo = Integer.parseInt(st.nextToken());
    
        // 두번째 라인의 숫자 배열
        long[] sLong = new long[suNo+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=suNo; i++){
            sLong[i] = sLong[i-1] + Integer.parseInt(st.nextToken());
        }
        // 질의 수만큼 입력 받아서 계산
        for(int q=0; q<quizNo; q++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(sLong[j] - sLong[i-1]);
        }
    }
}
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader 
      = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer 
      = new StringTokenizer(bufferedReader.readLine());
    int suNo = Integer.parseInt(stringTokenizer.nextToken());
    int quizNo = Integer.parseInt(stringTokenizer.nextToken());
    long[] S = new long[suNo + 1];
    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
    for (int i = 1; i <= suNo; i++) {
      S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
    }
    for (int q = 0; q < quizNo; q++) {
      stringTokenizer = new StringTokenizer(bufferedReader.readLine());
      int i = Integer.parseInt(stringTokenizer.nextToken());
      int j = Integer.parseInt(stringTokenizer.nextToken());
      System.out.println(S[j] - S[i - 1]);
    }
  }
}