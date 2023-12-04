import java.util.ArrayList;
import java.util.List;

class Solution {
  public static int solution(String my_string, String is_suffix) {
    // 빈 배열을 만든다.
    List<String> arr = new ArrayList<String>();
    // 반복문으로 뒤에서부터 잘라서 배열을 만든다.
    for (int i = my_string.length()-1; i >= 0 ; i--) {
      arr.add(my_string.substring(i));
    }

    // contains로 일치하는 값을 찾는다.
    return arr.contains(is_suffix) ? 1 : 0;
  }
}