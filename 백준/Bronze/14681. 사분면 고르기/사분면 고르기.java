import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    // input 값 받기
    BufferedReader reader
      = new BufferedReader(new InputStreamReader(System.in));
    int x = Integer.parseInt(reader.readLine());
    int y = Integer.parseInt(reader.readLine());

    // 1 사분면: x > 0, y > 0
    // 2 사분면: x < 0, y > 0
    // 3 사분면: x < 0, y < 0
    // 4 사분면: x > 0, y < 0
    if (x > 0) {
      System.out.println( y > 0 ? 1 : 4);
    } else {
      System.out.println(y > 0 ? 2 : 3);
    }
  }
}
