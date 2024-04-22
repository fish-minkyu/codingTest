import java.util.ArrayList;
import java.util.List;

class Solution {
  public String[] solution(String[] picture, int k) {
    // 4중 반복문

    List<String> result = new ArrayList<>();

    for (String str : picture) {
      char[] arg = str.toCharArray();
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < arg.length; i++) {
        for (int j = 0; j < k; j++) {
          sb.append(arg[i]);
        }
      }

      for (int i = 0; i < k; i++) {
        result.add(sb.toString());  
      }
    }

    return result.toArray(new String[0]);
  }
}