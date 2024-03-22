import java.util.Arrays;

public class Solution {
  public String solution(String my_string) {
   String lowerCase = my_string.toLowerCase();

   char[] chars = lowerCase.toCharArray();
    Arrays.sort(chars);
    lowerCase = new String(chars);
    
    return lowerCase;
  }
}