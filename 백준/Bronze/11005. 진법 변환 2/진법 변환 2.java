import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] info = reader.readLine().split(" ");
        int N = Integer.parseInt(info[0]);
        int B = Integer.parseInt(info[1]);
        int tmp = 0;

        StringBuilder answer = new StringBuilder();
        while (N > 0) {
            tmp = N % B;
            // N을 B로 나누었을 때  나머지가 10이상일 때
            // 10진법 이상이므로 10 이상인 숫자는 문자로 표시
            if (tmp >= 10) {
                // ASCII에서 A는 65이다.
                // Ex. tmp가 11이라면 11 + 55 => B
                char c = (char) (tmp + 55);
                answer.append(c);
            } else {
                answer.append(tmp);
            }
            N = N / B;
        }

        System.out.println(answer.reverse());
    }
}