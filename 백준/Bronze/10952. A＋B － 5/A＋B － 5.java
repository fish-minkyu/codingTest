import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      String[] input = reader.readLine().split(" ");

      int a = Integer.parseInt(input[0]);
      int b = Integer.parseInt(input[1]);

      if (a +  b == 0) break;
      
      System.out.println(a + b);
    }
  }
}
