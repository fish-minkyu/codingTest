import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

    String n = st.nextToken();
    int N = Integer.parseInt(st.nextToken());

    int ans = 0;
    for (int i = 0; i < n.length(); i++) {
      char c = n.charAt(i);
      if ('A' <= c && c <= 'z') {
        ans = ans * N + ((c - 'A') + 10);
      } else {
        ans = ans * N + (c - '0');
      }
    }
    System.out.println(ans);
  }
}
