import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    // input 값 받기
    BufferedReader reader
      = new BufferedReader(new InputStreamReader(System.in));
    int year = Integer.parseInt(reader.readLine());

    int result =
      ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? 1 : 0;

    System.out.println(result);
  }
}
