class Solution {
  public String solution(int[] numLog) {
    String result = "";
    // 반복문
    for (int i = 1; i < numLog.length; i++) {
      int flag = numLog[i] - numLog[i -1];

      switch (flag) {
        case 1:
          result += "w";
          break;
        case -1:
          result += "s";
          break;
        case 10:
          result += "d";
          break;
        case -10:
          result += "a";
          break;
      }
    }

    return result;
  }
}