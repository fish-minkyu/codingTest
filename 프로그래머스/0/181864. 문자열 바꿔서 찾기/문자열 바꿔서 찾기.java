class Solution {
  public int solution(String myString, String pat) {
    StringBuilder sb = new StringBuilder();
    
    for (String str : myString.split("")) {
      if (str.equals("A")) sb.append("B");
      else sb.append("A");
    }
    
    if (sb.toString().contains(pat)) return 1;
    else return 0;
  }
}