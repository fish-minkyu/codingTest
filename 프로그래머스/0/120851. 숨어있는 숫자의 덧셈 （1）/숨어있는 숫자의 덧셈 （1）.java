class Solution {
  public int solution(String my_string) {
    int result = 0;
    
    for (char text : my_string.toCharArray()) {
      if (text >= '0' && text <= '9') result += text - '0';
    }

    return result;
  }
}