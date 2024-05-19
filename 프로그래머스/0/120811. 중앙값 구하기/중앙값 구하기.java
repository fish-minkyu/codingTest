import java.util.Arrays;

class Solution {
  public int solution(int[] array) {

    Arrays.sort(array);
    return array[(int) Math.floor((double) array.length / 2)];
  }
}