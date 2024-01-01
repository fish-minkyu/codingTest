import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(System.in));

    int T = Integer.parseInt(reader.readLine());
    for (int i = 0; i < T; i++) {
     StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
     int repeat = Integer.parseInt(st.nextToken());
     String[] str = st.nextToken().split("");
     String result = "";

      for (int j = 0; j < str.length; j++) {
        for (int k = 0; k < repeat; k++) {
          result += str[j];
        }
      }

      System.out.print(result + "\n");
    }
  }
}
