import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<String> solution(String[] names) {
    // index 0, 5, 10 ...것들만 뽑아 result 배열에 넣는다.

    List<String> fiveList = new ArrayList<String>();
    for (int i = 0; i < names.length; i++) {
      if (i % 5 == 0) {
        fiveList.add(names[i]);
      }
    }

    return fiveList;
  }
}