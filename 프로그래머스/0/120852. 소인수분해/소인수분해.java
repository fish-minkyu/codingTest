import java.util.*;

public class Solution {
  public int[] solution(int n) {
    List<Integer> ans1 = new ArrayList<>();
    Set<Integer> ans = new HashSet<>();

    // n까지 반복
    // n을 나눌 수 있는 수 중, 소수만 answer에 넣기
    for (int i = 2; i <= n; i++) {
      if (n % i == 0) {
        List<Integer> flag = new ArrayList<>();
        for (int j = 2; j <= i ; j++) {
          if (i % j == 0) flag.add(j);
        }

        if (flag.size() == 1) ans.add(i);
      }
    }

    int[] array = new int[ans.size()];
    int i = 0;
    for (Integer val : ans) {
      array[i++] = val;
    }
    
    Arrays.sort(array);
    return array;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(new Solution().solution(9)));
  }
}
