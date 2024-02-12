import java.util.Arrays;

public class Solution {
  public String[] solution(String my_string) {
    // my_string.length() 초기화
    int length = my_string.length();
    // 배열 생성
    String[] arr = new String[length];
    // 접미사 배열 생성
    for (int i = length -1; i >= 0 ; i--) {
      arr[i] = my_string.substring(i, length);
    }

    Arrays.sort(arr);
      
    return arr;
  }
}
