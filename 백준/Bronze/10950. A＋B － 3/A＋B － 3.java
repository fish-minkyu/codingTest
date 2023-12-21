import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(System.in));

    int round = Integer.parseInt(reader.readLine());
    String[] str = new String[round];

    for (int i = 0; i < str.length; i++) {
      String[] input = reader.readLine().split(" ");
      int A = Integer.parseInt(input[0]);
      int B = Integer.parseInt(input[1]);
      System.out.println(A + B);
    }
  }
}
