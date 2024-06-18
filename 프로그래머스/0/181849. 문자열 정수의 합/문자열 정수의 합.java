class Solution {
  public int solution(String num_str) {
    String[] arr = num_str.split("");
    int sum = 0;
    for (String num : arr) {
      if (num.equals("0")) continue;
      sum += Integer.parseInt(num);
    }
    
    return sum;
  }
}