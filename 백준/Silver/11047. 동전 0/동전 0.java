import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String[] info = reader.readLine().split(" ");
    Integer n = Integer.parseInt(info[0]);
    Integer k = Integer.parseInt(info[1]);

    int[] coinList = new int[n];

    for (int i = 0; i < n; i++) {
      coinList[n - 1 - i] = Integer.parseInt(reader.readLine());
    }

    int count = 0;
    for (int i = 0; i < n; i++) {
      int coin = coinList[i];
      count += k / coin;
      k %= coin;
    }

    System.out.println(count);
  }
}