import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader
      = new BufferedReader(new InputStreamReader(System.in));

    String[] input = reader.readLine().split(" ");
    String[] arr = reader.readLine().split(" ");

    int count = Integer.parseInt(input[0]);
    int target = Integer.parseInt(input[1]);

    for (int i = 0; i < count; i++) {
      if (Integer.parseInt(arr[i]) < target) System.out.print(Integer.parseInt(arr[i]) + " ");
    }
  }
}
