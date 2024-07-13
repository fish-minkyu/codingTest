import java.util.ArrayList;
import java.util.List;

class Solution {
  public String[] solution(String[] todo_list, boolean[] finished) {
    List<String> result = new ArrayList<>();

    for (int i = 0; i < finished.length; i++) {
      if (!finished[i]) result.add(todo_list[i]);
    }

    return result.toArray(new String[0]);
  }
}