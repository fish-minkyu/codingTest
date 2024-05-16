import java.util.*;

class Solution {
  public int[] solution(int[] numbers, int num1, int num2) {
    int[] ans = Arrays.stream(numbers, num1, num2+1).toArray();

    return ans;
  }
}