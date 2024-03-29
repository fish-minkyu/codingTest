
class Solution {
  public int solution(int[] array) {
    int count = 0;
    for (int i = 0; i < array.length; i++) {
      String flag = array[i] + "";
      String[] str = flag.split("");
      for (int j = 0; j < str.length; j++) {
        if (str[j].equals("7")) count++;
      }
    }
    return count;
  }
}