import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(System.in));

    String count = reader.readLine();
    String[] arr = reader.readLine().split(" ");
    String target = reader.readLine();

    int acc = 0;
    for (String arg : arr) {
      if (arg.equals(target)) acc++;
    }

    System.out.println(acc);
  }
}
