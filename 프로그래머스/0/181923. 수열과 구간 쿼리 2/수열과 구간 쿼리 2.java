import java.util.ArrayList;
import java.util.List;

class Solution {
  public int[] solution(int[] arr, int[][] queries) {
    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < queries.length; i++) {
      int s = queries[i][0];
      int e = queries[i][1];
      int k = queries[i][2];
      int result = Integer.MAX_VALUE;

      for (int j = s; j <= e; j++) {
        if (arr[j] > k) {
          if (result > arr[j]) result = arr[j];
        }
      }
      if (result == Integer.MAX_VALUE) result = -1;
      list.add(result);
    }

    return list.stream().mapToInt(n -> n).toArray();
  }
}