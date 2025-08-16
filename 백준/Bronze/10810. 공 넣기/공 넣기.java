import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = reader.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);

        int[] baskets = new int[N];
        for (int i = 0; i < M; i++) {
            String[] info = reader.readLine().split(" ");
            int start = Integer.parseInt(info[0]);
            int end = Integer.parseInt(info[1]);
            int ball = Integer.parseInt(info[2]);

            for (int j = start -1; j < end; j++) {
                baskets[j] = ball;
            }
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < N; i++) {
            answer.append(baskets[i]).append(" ");
        }

        System.out.println(answer);
    }
}