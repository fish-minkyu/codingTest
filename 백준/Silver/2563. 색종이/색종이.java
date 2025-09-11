import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        // 도화지의 크기는 정해져 있다.
        int[][] board = new int[100][100];
        for (int i = 0; i < N; i++) {
            // 입력받는 내용은 왼쪽 위의 점이다.
            String[] leftUp = reader.readLine().split(" ");
            int startLeft = Integer.parseInt(leftUp[0]);
            int startUp = Integer.parseInt(leftUp[1]);
            // 왼쪽에서 오른쪽으로 x좌표가 움직이며 아래에서 위쪽 방향으로 1을 채워준다.
            for (int j = startLeft; j < startLeft + 10; j++) {
                for (int k = startUp; k < startUp + 10; k++) {
                    // 덧칠해도 무방하다.
                    board[k][j] = 1;
                }
            }
        }

        // 100 * 100을 전부 순회하며 1을 센다.
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                sum += board[i][j];
            }
        }
        
        System.out.println(sum);
    }
}