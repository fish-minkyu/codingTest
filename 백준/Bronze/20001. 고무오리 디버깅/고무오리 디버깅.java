import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(System.in));

    // stack
    Stack<String> problem = new Stack<>();
    int count = 0;

    while (true) {
      String duck = reader.readLine();
      // 멈춤 조건 명시
      if (duck.equals("고무오리 디버깅 끝")) break;
      // 문제라면 push
      if (duck.equals("문제")) problem.push("문제");
      // 비어있는데 고무오리라면 문제 X 2
      if (problem.empty()) {
        if (duck.equals("고무오리")) {
          problem.push("문제");
          problem.push("문제");
        }
      } else {
        if (duck.equals("고무오리")) {
          problem.pop();
        }
      }
    }
    // 순환 종료
    System.out.println(problem.empty() ? "고무오리야 사랑해" : "힝구");
  }
}
