import java.util.ArrayList;
import java.util.List;

public class Solution {

  public List<String> solution(String[] strArr) {

    List<String> arr = new ArrayList<>();
    
    for (String test: strArr) {
      if (!test.contains("ad")) {
        arr.add(test);
      }
    }
    
    return arr;
  }
}
