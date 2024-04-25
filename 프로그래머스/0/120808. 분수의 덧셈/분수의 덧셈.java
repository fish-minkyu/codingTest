class Solution {
  public int[] solution(int numer1, int denom1, int numer2, int denom2) {

    int gcd1 = gcd(denom1, denom2); // 분모들의 최대 공약수
    int denom = denom1 * denom2 / gcd1; // 분모 (= 최소 공배수)

    int multi1 = denom / denom1;
    int multi2 = denom / denom2;

    int numer = numer1 * multi1 + numer2 * multi2; // 분자

    int gcd2 = gcd(numer, denom);

    return new int[]{numer / gcd2, denom / gcd2};
  }

  public static int gcd(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }

    return a;
  }
}