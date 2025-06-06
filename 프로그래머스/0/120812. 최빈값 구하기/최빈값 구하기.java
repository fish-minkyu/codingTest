import java.util.HashMap;
import java.util.Map;

class Solution {
  public int solution(int[] array) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : array) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    int countMax = 0;
    for (int count : map.values()) {
      countMax = Math.max(countMax, count);
    }

    int answer = -1;
    int modeCount = 0;
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() == countMax) {
          modeCount++;
          if (modeCount == 1) {
            answer = entry.getKey();
          } else {
            answer = -1;
          }
      }
    }

    return answer;
  }
}