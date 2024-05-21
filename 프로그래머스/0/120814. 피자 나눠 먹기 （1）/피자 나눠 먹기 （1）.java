class Solution {
  public int solution(int n) {
    int answer = 0;
    if (n % 7 == 0) return answer = n / 7;
    else if (n < 7) return answer = 1;
    else return answer = n / 7 +1;
  }
}