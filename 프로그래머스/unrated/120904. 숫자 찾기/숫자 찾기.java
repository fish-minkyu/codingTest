class Solution {
  public int solution(int num, int k) {
   String strNum = String.valueOf(num);
   String strK = String.valueOf(k);
   int result;

   if (strNum.contains(strK)) return result = strNum.indexOf(strK) +1;
   else return result = -1;
  }
}