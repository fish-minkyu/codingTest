import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader
      = new BufferedReader(new InputStreamReader(System.in));

    String S = reader.readLine();
    System.out.println(S.charAt(Integer.parseInt(reader.readLine()) -1));
  }
}
