import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(System.in));

    int total = Integer.parseInt(reader.readLine());
    int sort = Integer.parseInt(reader.readLine());

    int sum = 0;

    for (int i = 0; i < sort; i++) {
      String[] input = reader.readLine().split(" ");
      int price = Integer.parseInt(input[0]);
      int count = Integer.parseInt(input[1]);

      sum += price * count;
    }

    if (total == sum) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
