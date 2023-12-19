import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    // input 값 받기
    BufferedReader reader
      = new BufferedReader(new InputStreamReader(System.in));
    int score = Integer.parseInt(reader.readLine());

    if (score < 60) {
      System.out.println('F');
    } else if (score < 70) {
      System.out.println('D');
    } else if (score < 80) {
      System.out.println('C');
    } else if (score < 90) {
      System.out.println('B');
    } else {
      System.out.println('A');
    }
  }
}
