public class Solution {
  public int solution(int n) {
    // n과 6의 최소공배수를 구하고 6으로 나눈다.
    int lcm = n * 6 / gcd(n, 6);
    
    return lcm / 6;
  }

  // 최대공약수
  public static int gcd(int a, int b) {

    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }

    return a;
  }
}