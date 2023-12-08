import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<Integer> solution(int start, int end_num) {
    List<Integer> result = new ArrayList<>();

    for (int i = start; i >= end_num; i--) {
      result.add(i);
    }

    return result;
  }
}