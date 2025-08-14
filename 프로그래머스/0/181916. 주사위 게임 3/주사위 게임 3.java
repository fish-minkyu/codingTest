import java.util.Arrays;

public class Solution {
    public int solution(int a, int b, int c, int d) {
        // 정렬을 먼저 하면 쉽게 판단 가능
        int[] numbers = {a, b, c, d};
        Arrays.sort(numbers);

        // 전체 일치
        if (numbers[0] == numbers[3]){
            return 1111 * numbers[0];
        }
        // 3개 일치
        else if (numbers[0] == numbers[2]) {
            return (numbers[0] * 10 + numbers[3]) * (numbers[0] * 10 + numbers[3]);
        }
        // 일단 2개 일치
        else if (numbers[0] == numbers[1]) {
            // 둘둘 일치
            if (numbers[2] == numbers[3]) {
                return (numbers[0] + numbers[2]) * Math.abs(numbers[0] - numbers[2]);
            }
            // 둘 하나 일치
            else {
                return numbers[2] * numbers[3];
            }
        }
        // 제일 작은건 불일치
        else {
            // 나머지 셋 일치
            if (numbers[1] == numbers[3]) {
                return (numbers[1] * 10 + numbers[0]) * (numbers[1] * 10 + numbers[0]);
            }
            // 중간 둘 일치
            else if (numbers[1] == numbers[2]) {
                return numbers[0] * numbers[3];
            }
            // 끝 둘 일치
            else if (numbers[2] == numbers[3]) {
                return numbers[0] * numbers[1];
            }
            // 전체 불일치
            else {
                return numbers[0];
            }
        }
    }
}
