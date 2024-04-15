import java.util.ArrayList;
import java.util.List;

class Solution {
  public int solution(int[] numbers, int k) {

    List<Integer> ball = new ArrayList<>();

    for (int i = 0; i < k*2; i+=2) {
      ball.add(numbers[i % numbers.length]);
    }

    return ball.get(ball.size() -1);
  }
}