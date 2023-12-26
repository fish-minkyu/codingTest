import java.io.*;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader
      = new BufferedReader(new InputStreamReader(System.in));

    // N: 배열의 크기, M: 반복 횟수

    String[] input = reader.readLine().split(" ");
    int N = Integer.parseInt(input[0]);
    int M = Integer.parseInt(input[1]);

    int[] arr = new int[N];
    for (int i = 0; i < M; i++) {
      String[] circle = reader.readLine().split(" ");
      int first = Integer.parseInt(circle[0]);
      int last = Integer.parseInt(circle[1]);
      int insert = Integer.parseInt(circle[2]);

      for (int j = first -1; j < last; j++) {
        arr[j] = insert;
      }
    }

    for (int z = 0; z < arr.length; z++) {
      System.out.print(arr[z] + " ");
    }
  }
}
