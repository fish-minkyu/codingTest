import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader
      = new BufferedReader(new InputStreamReader(System.in));

    StringBuilder sb = new StringBuilder();

    String str;

    while ((str = reader.readLine()) != null) {
      int a = Integer.parseInt(str.split(" ")[0]);
      int b = Integer.parseInt(str.split(" ")[1]);

      sb.append(a+b).append("\n");
    }

    System.out.println(sb);
  }
}
