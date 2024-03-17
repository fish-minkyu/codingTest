public class Solution {
  public int[][] solution(int n) {
    int[][] arr = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == j) arr[i][j] = 1;
        else arr[i][j] = 0;
      }
    }

    return arr;
  }
}