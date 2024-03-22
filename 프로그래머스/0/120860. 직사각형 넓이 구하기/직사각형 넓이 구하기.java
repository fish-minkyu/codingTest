import java.util.HashSet;
import java.util.Set;

public class Solution {
  public int solution(int[][] dots) {
    // Set 선언
    Set<Integer> x = new HashSet<>();
    Set<Integer> y = new HashSet<>();

    // x, y끼리 모아준다.
    for (int[] arr : dots) {
      x.add(arr[0]);
      y.add(arr[1]);
    }

    int[] arr1 = x.stream().mapToInt(Integer::intValue).sorted().toArray();
    int[] arr2 = y.stream().mapToInt(Integer::intValue).sorted().toArray();

    int width = arr1[1] - arr1[0];
    int height = arr2[1] - arr2[0];

    return width * height;
  }

  public static void main(String[] args) {
    int[][] dots = {
      {1, 1},
      {2, 1},
      {2, 2},
      {1, 2}
    };

    System.out.println(new Solution().solution(dots));
  }
}
