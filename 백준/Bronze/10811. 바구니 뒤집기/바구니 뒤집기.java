import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader
      = new BufferedReader(new InputStreamReader(System.in));

    // StringTokenizer 생성
    StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    // 배열 생성
    int[] arr = new int[N];
    // 1 ~ 5 값 넣기
    for (int i = 0; i < N; i++) {
      arr[i] = i+1;
    }

    for (int i = 0; i < M; i++) {
      // 재할당
      st = new StringTokenizer(reader.readLine(), " ");
      // index이므로 -1 넣기
      int left = Integer.parseInt(st.nextToken()) -1;
      int right = Integer.parseInt(st.nextToken()) -1;

      // 역순 배치
      // 후위 증감연산 사용
      while (left < right) {
        int temp = arr[left];
        arr[left++] = arr[right];
        arr[right--] = temp;
      }
    }
    // BufferedReader 닫기
    reader.close();

    for (int result : arr)  {
      System.out.print(result + " ");
    }
  }
}
