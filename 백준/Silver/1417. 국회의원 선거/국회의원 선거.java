import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    // 총 후보자들
    int candidates = Integer.parseInt(reader.readLine());
    // 내 득표수
    int myVote = Integer.parseInt(reader.readLine());
    // 나머지 후보들의 득표수를 관리할 우선순위 큐
    PriorityQueue<Integer> otherVotes
      = new PriorityQueue<>(Collections.reverseOrder());
    // +) // Collections.reverseOrder(): 컬렉션의 자연 순서를 반대로 하는 비교자(Comparator)를 반환한다.

    // 나머지 후보들의 득표를 우선순위 큐에 넣어준다
    for (int i = 0; i < candidates - 1; i++)
      otherVotes.add(Integer.parseInt(reader.readLine()));

    // 몇표를 조작했는지
    int answer = 0;
    // 다른 후보자의 표들 중 가장 많은 득표수가
    // 나의 득표수보다 클 동안 반복
    if (!otherVotes.isEmpty()) while (otherVotes.peek() >= myVote) {
      int maxVotes = otherVotes.poll();
      // 한표 뺏어온다.
      otherVotes.offer(maxVotes - 1);
      // 내표로 만든다.
      myVote++;
      // 한표 조작했음을 기록한다.
      answer++;
    }

    System.out.println(answer);
  }
}