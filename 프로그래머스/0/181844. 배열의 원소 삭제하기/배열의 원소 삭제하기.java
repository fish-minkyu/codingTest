import java.util.ArrayList;
import java.util.List;

class Solution {
  public int[] solution(int[] arr, int[] delete_list) {
    List<Integer> result = new ArrayList<>();

    for (int num : arr) {
      result.add(num);
    }

    for (int num : delete_list) {
      result.remove((Integer) num);
    }

    return result.stream().mapToInt(i -> i).toArray();
  }
}