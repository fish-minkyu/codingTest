import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(System.in));

    // input
    String s = reader.readLine();
    // alphabet
    Character[] alphabet = {
      'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
      'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
      'w', 'x', 'y', 'z'
    };


    for (int i = 0; i < alphabet.length; i++) {
      System.out.print(String.format("%d ", s.indexOf(alphabet[i])));
    }
  }
}
