public class Solution {
  public StringBuilder solution(String str1, String str2) {
   char[] chars1 = str1.toCharArray();
   char[] chars2 = str2.toCharArray();

   StringBuilder result = new StringBuilder();
    for (int i = 0; i < chars1.length; i++) {
      result.append(chars1[i]);
      result.append(chars2[i]);
    }
    
    return result;
  }
}
