import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(System.in));

    int num = Integer.parseInt(reader.readLine());

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < num; i+= 4) {
      sb.append("long ");
    }

    System.out.println(sb + "int");
  }
}
