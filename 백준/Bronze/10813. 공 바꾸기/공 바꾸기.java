import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader
      = new BufferedReader(new InputStreamReader(System.in));

    // N: 배열의 크기, M: 반복 횟수

    String[] input = reader.readLine().split(" ");
    int N = Integer.parseInt(input[0]);
    int M = Integer.parseInt(input[1]);

    int[] arr = new int[N];

    for (int i = 0; i < N; i++) {
      arr[i] = i + 1;
    }
    
    for (int j = 0; j < M; j++) {
      String[] circle = reader.readLine().split(" ");
      int first = Integer.parseInt(circle[0]);
      int last = Integer.parseInt(circle[1]);

      int pocket = arr[first -1];
      arr[first -1] = arr[last -1];
      arr[last -1] = pocket;
    }

    for (int z = 0; z < N; z++) {
      System.out.print(arr[z] + " ");
    }
  }
}
