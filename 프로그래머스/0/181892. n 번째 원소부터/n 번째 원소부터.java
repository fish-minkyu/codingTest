import java.util.stream.IntStream;

class Solution {
  public int[] solution(int[] num_list, int n) {
    return IntStream.range(n-1, num_list.length).map(num -> num_list[num]).toArray();
  }
}