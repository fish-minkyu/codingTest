class Solution {
  public int[] solution(int[] num_list, int n) {
      int[] result = new int[num_list.length];

      for (int i = n; i < num_list.length + n; i++) {
          int flag = 0;
          if (i >= num_list.length) {
              flag = i - num_list.length;
              result[i - n] = num_list[flag];
          }
          else result[i - n] = num_list[i];
      }

      return result;
  }
}