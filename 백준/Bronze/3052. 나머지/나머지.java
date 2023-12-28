import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(System.in));

    // 배열 선언
    Integer[] arr = new Integer[10];

    // 10번 반복, 42 나누기, 배열에 나머지를 넣기
    for (int i = 0; i < 10; i++) {
      int A = Integer.parseInt(reader.readLine());
      arr[i] = A % 42;
    }
    // Set 만들기
    Set<Integer> num = new HashSet<>(List.of(arr));
    // count 하기
    System.out.println(num.size());
  }
}