import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        while(n>0)  // 0 이상일때만 반복문 실행
        {
            answer+=n%10;
            n/=10;
        }
        
        
        return answer;
    }
}