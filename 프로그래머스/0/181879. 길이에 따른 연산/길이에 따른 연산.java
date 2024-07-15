class Solution {
  public int solution(int[] num_list) {
    int ans = (num_list.length > 10 ? 0 : 1);

    for (int num : num_list) {
      if (num_list.length < 11) ans *= num;
      else ans += num;
    }
    
    return ans;
  }
}