class Solution {
  public int solution(int[] array, int height) {
    int result = 0;
    for (int num : array) {
      if (height < num) result++;
    }

    return result;
  }
}