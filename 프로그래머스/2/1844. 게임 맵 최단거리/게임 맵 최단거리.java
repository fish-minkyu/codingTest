
import java.util.LinkedList;
import java.util.Queue;

class Solution {
  private int n;
  private int m;
  private final int[] dy = {-1, 1, 0, 0};
  private final int[] dx = {0, 0, -1, 1};

  public int solution(int[][] maps) {
    int answer = -1;

    n = maps.length;
    m = maps[0].length;
    boolean[][] visited = new boolean[n][m];
    Queue<int[]> toVisit = new LinkedList<>();
    // 처음은 항상 0, 0 이며, 첫 칸도 움직인걸로 판단한다.
    toVisit.offer(new int[]{0, 0, 1});
    while (!toVisit.isEmpty()) {
      // 현재 위치로 방문한다.
      int[] now = toVisit.poll();
      int nowY = now[0];
      int nowX = now[1];
      // 다른 방향에서 온적 있다면 아무작업하지 않는다.
      if (visited[nowY][nowX])
        continue;
      visited[nowY][nowX] = true;

      int steps = now[2];
      // 우하단에 도착했다면 기록하고 중단한다.
      if (nowY == n - 1 && nowX == m - 1) {
        answer = steps;
        break;
      }

      // 다음에 방문할 점들을 기록한다.
      for (int i = 0; i < 4; i++) {
        int nextY = nowY + dy[i];
        int nextX = nowX + dx[i];
        if (
          // nextY와 nextX가 미로 내부에 있는지,
          checkBounds(nextY, nextX) &&
            // 이동 가능한 공간인지(1),
            maps[nextY][nextX] == 1 &&
            // 아직 방문하지 않았는지
            !visited[nextY][nextX]
        ) {
          toVisit.offer(new int[]{nextY, nextX, steps + 1});
        }
      }
    }
    return answer;
  }

  private boolean checkBounds(int y, int x) {
    return
      -1 < y && y < n &&
        -1 < x && x < m;
  }
}