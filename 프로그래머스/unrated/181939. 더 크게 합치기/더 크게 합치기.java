class Solution {
  public int solution(int a, int b) {
    String x = String.valueOf(a);
    String y = String.valueOf(b);
    String answer1 = x + y;
    String answer2 = y + x;

    if (Integer.parseInt(answer1) < Integer.parseInt(answer2)) {
      return Integer.parseInt(answer2);
    } else {
      return Integer.parseInt(answer1);
    }
  }
}