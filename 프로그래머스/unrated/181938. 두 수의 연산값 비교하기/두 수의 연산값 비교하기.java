class Solution {
  public int solution(int a, int b) {
    Integer x = Integer.parseInt("" + a + b);
    int y = 2 * a * b;
    
    return x >= y ? x : y; 
  }
}