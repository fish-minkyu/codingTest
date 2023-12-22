import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(System.in));

    BufferedWriter bw =
      new BufferedWriter(new OutputStreamWriter(System.out));

    int round = Integer.parseInt(reader.readLine());

    for (int i = 0; i < round; i++) {
      String[] input = reader.readLine().split(" ");
      int a = Integer.parseInt(input[0]);
      int b = Integer.parseInt(input[1]);
      bw.write(a + b + "\n");
    }

      bw.close();
  }
}
