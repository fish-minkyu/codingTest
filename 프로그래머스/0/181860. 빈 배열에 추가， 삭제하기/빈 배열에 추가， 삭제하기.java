import java.util.ArrayList;
import java.util.List;

class Solution {
  public int[] solution(int[] arr, boolean[] flag) {
    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
      int injection = arr[i];
      if (flag[i]) {
        for (int j = 0; j < injection * 2; j++) {
          list.add(injection);
        }
      } else {
        for (int j = 0; j < injection; j++) {
          list.remove(list.size() -1);
        }
      }
    }

    return list.stream().mapToInt(i -> i).toArray();
  }
}