import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader
      = new BufferedReader(new InputStreamReader(System.in));

    int[] arr = new int[9];
    int max = arr[0];
    int index = 0;

    for (int i = 0; i < 9; i++) {
      arr[i] = Integer.parseInt(reader.readLine());
    }

    for (int i = 0; i < 9; i++) {
      if (arr[i] > max) {
        max = arr[i];
        index = i + 1;
      }
    }

    System.out.println(max + "\n" + index);
  }
}
