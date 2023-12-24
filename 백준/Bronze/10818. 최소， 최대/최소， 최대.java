import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader
      = new BufferedReader(new InputStreamReader(System.in));

    int count = Integer.parseInt(reader.readLine());
    String[] arr = reader.readLine().split(" ");

    int min = Integer.parseInt(arr[0]);
    int max = Integer.parseInt(arr[0]);

    for (int i = 0; i < count; i++) {
      if (Integer.parseInt(arr[i]) < min) min = Integer.parseInt(arr[i]);
      if (Integer.parseInt(arr[i]) > max) max = Integer.parseInt(arr[i]);
    }

    System.out.print(min + " " + max);
  }
}
