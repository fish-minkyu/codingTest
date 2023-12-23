import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(System.in));

    int round = Integer.parseInt(reader.readLine());

    for (int i = 1; i <= round; i++) {
      String star = "*";
      System.out.println(star.repeat(i));
    }
  }
}
