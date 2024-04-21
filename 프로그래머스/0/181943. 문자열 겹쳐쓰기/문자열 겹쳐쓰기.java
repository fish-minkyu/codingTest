class Solution {
  public String solution(String my_string, String overwrite_string, int s) {
    char[] result = my_string.toCharArray();
    char[] update = overwrite_string.toCharArray();

    for (int i = 0; i < overwrite_string.length(); i++) {
      result[s] = update[i];
      s++;
    }

    return String.valueOf(result);
  }
}