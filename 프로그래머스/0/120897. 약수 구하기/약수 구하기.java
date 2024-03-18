import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
  public int[] solution(int n) {

    List<Integer> arr = new ArrayList<>();

    for (int i = 1; i <= n; i++) {
      if (n % i == 0) arr.add(i);
    }

    int[] result = new int[arr.size()];
    // List -> []
    for (int i = 0; i < arr.size(); i++) {
      result[i] = arr.get(i);
    }

    return result;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(new Solution().solution(9)));
  }
}