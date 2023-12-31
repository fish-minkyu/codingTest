import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader
      = new BufferedReader(new InputStreamReader(System.in));

    int count = Integer.parseInt(reader.readLine());
    for (int i = 0; i < count; i++) {
      String input = reader.readLine();
      String first = String.valueOf(input.charAt(0));
      String last = String.valueOf(input.charAt(input.length() -1));
      System.out.println(String.valueOf(first + last));
    }
    reader.close();
  }
}
