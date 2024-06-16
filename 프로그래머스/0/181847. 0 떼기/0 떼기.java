class Solution {
  public String solution(String n_str) {
    char[] arr = n_str.toCharArray();
    int idx = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == '0') continue;
      idx = i;
      break;
    }

    return n_str.substring(idx);
  }
}