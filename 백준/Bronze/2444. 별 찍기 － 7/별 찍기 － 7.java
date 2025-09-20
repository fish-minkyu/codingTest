import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(reader.readLine());
    // 총 칸 수 = 2 * N -1 
    
    // 이중 반복문 - 오름차순
    for (int i = 1; i <= N; i++) {
      for (int j = 0; j < N-i; j++) System.out.print(" ");
      for (int j = 0; j < 2 * i - 1; j++) System.out.print("*");
      System.out.println();
    }

    // 이중 반복문 - 내림차순
    for (int i = N-1; i >= 1; i--) {
      for (int j = 0; j < N-i; j++) System.out.print(" ");
      for (int j = 0; j < 2 * i - 1; j++) System.out.print("*");
      System.out.println();
    }
  }
}