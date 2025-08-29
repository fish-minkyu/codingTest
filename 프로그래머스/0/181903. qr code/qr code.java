class Solution {
  public String solution(int q, int r, String code) {
   String answer = "";
   // for 반복을 한다.
    for (int i = 0; i < code.length(); i++) {
      if (i % q == r) {
      answer = answer + code.charAt(i);
      }
    }
    return answer;
  }
}