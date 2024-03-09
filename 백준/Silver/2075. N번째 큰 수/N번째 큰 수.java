import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(reader.readLine());
    // 최솟값이 우선적으로 나오는 우선순위 큐
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    // 숫자를 입력받는다.
    for (int i = 0; i < n; i++) {
      String[] lineNums = reader.readLine().split(" ");
      for (int j = 0; j < n; j++) {
        // 숫자를 우선순위 큐에 넣어준다.
        priorityQueue.offer(Integer.parseInt(lineNums[j]));
        // 만약 우선순위 큐의 크기가 n보다 커지면,
        if (priorityQueue.size() > n) {
          // 하나 빼서 n개로 유지한다.
          priorityQueue.poll();
        }
      }
    }
    System.out.println(priorityQueue.peek());
  }
}