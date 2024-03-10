import java.util.LinkedList;
import java.util.Queue;

class Solution {
  private int answer = 0;
  public int solution(int[] numbers, int target) {
    dfs(numbers, target, 0, 0);
    return answer;
  }
    
  // dfs 재귀함수 풀이  
  private void dfs(
    // 부호를 정해야 하는 숫자들
    int[] numbers,
    // 만들고자 하는 숫자
    int target,
    // 다음에 고려해봐야 하는 숫자
    int next,
    // 여태까지 합한 숫자
    int sum
  ) {
    // 모든 숫자를 고려했으면
    if (next == numbers.length) {
      // 타겟넘버인지 확인한다.
      if (sum == target) this.answer++;
    }
    else {
      // 이번 숫자는 더하고 다음 숫자를 결정하자
      dfs(numbers, target, next + 1, sum + numbers[next]);
      // 이번 숫자는 빼고 다음 숫자를 결정하자
      dfs(numbers, target, next + 1, sum - numbers[next]);
    }
  }
    
    
}