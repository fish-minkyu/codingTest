import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int n) {
        /**
         * 콜라츠 수열
         * x가 짝수일 땐 2로 나누고 홀수일 땐 3 * x + 1로 바꾸기
         * x가 1이 될때까지 반복
         */
        List<Integer> answer = new ArrayList<>();
        while (true) {
            answer.add(n);
            if (n == 1) break;
            
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }

        return answer;
    }
}