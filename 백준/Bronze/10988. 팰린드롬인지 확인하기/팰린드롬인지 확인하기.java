import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(System.in));
    String input = reader.readLine();

    // 1. StringBuffer 클래스를 이용해 객체 생성
    StringBuffer str = new StringBuffer(input);
    // 2. reverse
    String reversedStr = str.reverse().toString();
    // 3. if문을 통해 비교
    if (input.equals(reversedStr)) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }
}
