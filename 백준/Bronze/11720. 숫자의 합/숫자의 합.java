import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader
      = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(reader.readLine());

    int sum = 0;
    for (byte value : reader.readLine().getBytes()) {
      sum += (value - '0');
    }

    System.out.println(sum);
  }
}