import java.util.*;

class Solution {
  public int solution(int[] rank, boolean[] attendance) {
    List<Integer> grade = new ArrayList<>();
    Map<Integer, Integer> attendant = new HashMap<>();

    for (int i = 0; i < attendance.length; i++) {
      if (!attendance[i]) continue;
      grade.add(rank[i]);
      attendant.put(rank[i], i);
    }

    grade.sort(Comparator.naturalOrder());
    return attendant.get(grade.get(0)) * 10000 + attendant.get(grade.get(1)) * 100 + attendant.get(grade.get(2));
  }
}