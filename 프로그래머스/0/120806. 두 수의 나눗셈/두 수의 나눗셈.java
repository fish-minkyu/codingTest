class Solution {
  public int solution(int num1, int num2) {
    double flag = (double) num1/num2;
    return (int) Math.floor(flag * 1000);
  }
}