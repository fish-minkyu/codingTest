import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // 다섯 줄이 주어지지만(행은 주어지지만), 각 줄의 길이(열의 길이)는 주어지지 않는다.
        char[][] letters = new char[5][];
        // 한 줄의 최대 길이를 저장해둔다.
        int maxLength = 0;
        for (int i = 0; i < 5; i++) {
            // 각 줄을 받아 letters[i]에 한번에 저장한다.
            letters[i] = reader.readLine().toCharArray();
            // 그 줄의 길이를 최대 길이랑 비교해 최댓값을 저장한다.
            maxLength = Math.max(letters[i].length, maxLength);
        }

        // 출력을 담을 StringBuilder
        StringBuilder answer = new StringBuilder();
        // 각 행들의 자릿수 순으로 순회.
        // 가장 긴 가로줄만큼 순회한다. (i는 열을 의미한다.)
        for (int i = 0; i < maxLength; i++) {
            // 다섯 행이기 때문에 다섯번 순회한다. (j는 행을 의미한다.)
            for (int j = 0; j < 5; j++) {
                // 만약 j번 줄의 크기가 maxLength보다 작다면 확인하지 않는다.
                // (j번 줄의 i번째 자리가 없으므로 확인하지 않는다.)
                if (!(i < letters[j].length)) continue;
                // 그 외에는 저장
                answer.append(letters[j][i]);
            }
        }
        // 결과 출력
        System.out.println(answer);
    }
}