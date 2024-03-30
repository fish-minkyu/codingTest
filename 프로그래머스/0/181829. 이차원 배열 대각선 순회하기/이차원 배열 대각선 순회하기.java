class Solution {
  public int solution(int[][] board, int k) {
    int result = 0;
    for (int i = 0; i < board.length; i++) {
      int[] num = board[i];
      for (int j = 0; j < num.length; j++) {
        if (i + j <= k) result += board[i][j];
      }
    }
    
    return result;
  }
}