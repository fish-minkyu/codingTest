import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
  public static int[] solution(int[] array) {
    List<Integer> arr = new ArrayList<>();
    // array을 for문으로 반복하여 2의 인덱스를 arr에 넣는다.
    for (int i = 0; i < array.length; i++) {
      if (array[i] == 2) arr.add(i);
    }
    // 배열이 비었을 경우 -1 반환
    if (arr.isEmpty()) return new int[]{-1};
    // arr의 처음과 끝의 인덱스를 뽑는다.
    int a = arr.get(0);
    int b = arr.get(arr.size() -1);
    // 새로운 배열을 만든다.
    return Arrays.copyOfRange(array, a, b+1);
  }
}
