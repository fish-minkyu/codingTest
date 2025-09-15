import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // 정보 받기
        String[] info = reader.readLine().split(" ");
        int N = Integer.parseInt(info[0]);
        int M = Integer.parseInt(info[1]);

        // 배열 생성
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        // 역순으로 설정
        for (int i = 1; i <= M ; i++) {
            String[] reverseInfo = reader.readLine().split(" ");
            int first = Integer.parseInt(reverseInfo[0]) - 1;
            int last = Integer.parseInt(reverseInfo[1]) - 1;

            // 역순 배치
            while (first < last) {
                int temp = arr[first];
                arr[first++] = arr[last];
                arr[last--] = temp;
            }
        }

        // answer
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < N; i++) {
            answer.append(arr[i]).append(" ");
        }

        System.out.println(answer);
    }
}