import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(System.in));

    // 입력 한 줄 당 최대값, index+1, 입력 횟수를 기억해둔다.

    int max = -1;
    int index = -1;
    int count = -1;

    // 입력 횟수(행)
    for (int i = 1; i <= 9; i++) {
      StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
      // 인덱스 갯수(열)
      for (int j = 1; j <= 9; j++) {
        int num = Integer.parseInt(st.nextToken());
        if (num > max) {
          max = num;
          index = j;
          count = i;
        }
      }
    }

    // 전부 다 입력이 끝나면 최대값, 횟수, index+1을 반환한다.
    System.out.println(max);
    System.out.println(count + " " + index);
  }
}
