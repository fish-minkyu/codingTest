import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(System.in));

    String input = reader.readLine();
    String[] croatiaAlphabet = {"c=", "c-", "dz=", "d-", "lj", "nj","s=", "z="};

    for (String val : croatiaAlphabet) {
      input = input.replace(val, "A");
    }

    System.out.println(input.length());
  }
}
