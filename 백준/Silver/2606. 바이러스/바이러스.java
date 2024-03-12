import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 바이러스
// https://www.acmicpc.net/problem/2606
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int nodes = Integer.parseInt(reader.readLine());
    int edges = Integer.parseInt(reader.readLine());
    // 인접 리스트 준비
    List<List<Integer>> adjList = new ArrayList<>();
    for (int i = 0; i < nodes + 1; i++) {
      // 내부에 있는 리스트는 null이므로 새로운 ArrayList를 넣어줘야 한다.
      adjList.add(new ArrayList<>());
    }

    // 간선 정보 받아오기
    for (int i = 0; i < edges; i++) {
      String[] edge = reader.readLine().split(" ");
      int start = Integer.parseInt(edge[0]);
      int end = Integer.parseInt(edge[1]);
      adjList.get(start).add(end); // { {}, {2}, {1} }
      adjList.get(end).add(start);
    }

    Queue<Integer> toVisit = new LinkedList<>();
    // 시작점은 1이다.
    toVisit.offer(1);
    // 방문 기록
    boolean[] visited = new boolean[nodes + 1];
    // 1번을 방문했다는 것을 먼저 표시
    // 먼저 방문했다고 표시하면 탐색하는 정점의 갯수를 줄일 수 있다.
    visited[1] = true;
    // BFS 시작
    while (!toVisit.isEmpty()) {
      // 이번에 방문한 곳
      int now = toVisit.poll();
      // 다음 방문할 곳들을 찾아보자.
      for (int next: adjList.get(now)) {
        // 이미 방문(또는 예정)이면 스킵
        if (visited[next]) continue;
        // 방문한다고 미리 표시한다.
        visited[next] = true;

        // Queue에 넣어준다.
        toVisit.add(next);
      }
    }
    // 최종적으로 방문한 컴퓨터의 갯수를 세어준다.
    int count = 0;
    for (int i = 0; i < nodes + 1; i++) {
      if (visited[i]) count++;
    }
    System.out.println(count - 1); // 1 제외 count이므로 1을 빼준다.
  }
}