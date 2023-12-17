import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(System.in));

    String[] input = reader.readLine().split(" ");

    int A = Integer.parseInt(input[0]);
    int B = Integer.parseInt(input[1]);

    System.out.println(A + B);
    System.out.println(A - B);
    System.out.println(A * B);
    System.out.println(A / B);
    System.out.println(A % B);
  }
}
