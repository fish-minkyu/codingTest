import java.util.ArrayList;
import java.util.List;

public class Solution {
  public String solution(String my_string) {
    // 배열로 만든다.
    String[] arr = my_string.split("");

    List<String> res = new ArrayList<>();

    for (String str : arr) {
      if (!res.contains(str)) res.add(str);
    }
    
    return String.join("", res);
  }
}