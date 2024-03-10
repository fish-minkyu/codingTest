
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// https://www.acmicpc.net/problem/15903
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String[] info = reader.readLine().split(" ");
    int cardCount = Integer.parseInt(info[0]);
    int actions = Integer.parseInt(info[1]);

    String[] cards = reader.readLine().split(" ");

    // 가장 작은 두개의 카드를 골라서 합쳐야, 총 합을 최대한 작게 유지할 수 있다.
    // 그걸 위해 우선순위 큐에 넣어준다.
    PriorityQueue<Long> smallestCards = new PriorityQueue<>();
    for (int i = 0; i < cardCount; i++) {
      smallestCards.offer(Long.parseLong(cards[i]));
    }

    // 총 행하는 합체 횟수만큼 반복해서
    for (int i = 0; i < actions; i++) {
      // 1. 가장 작은 두개의 카드를 받아온다.
      long first = smallestCards.poll();
      long second = smallestCards.poll();
      // 2. 둘을 합친 숫자를 두번 우선순위 큐에 넣어준다.
      long sum = first + second;
      smallestCards.offer(sum);
      smallestCards.offer(sum);
    }
    // 3. 최종적으로 총 합을 구한다.
    long answer = 0;
    // smalledstCards가 비어있지 않는 동안
    while (!smallestCards.isEmpty()) {
      answer += smallestCards.poll();
    }
    System.out.println(answer);
  }
}
