class Solution {
  public String solution(String myString) {
    StringBuilder sb = new StringBuilder();

    for (String str : myString.split("")) {
      if (str.equals("a") || str.equals("A")) sb.append(str.toUpperCase());
      else sb.append(str.toLowerCase());
    }

    return sb.toString();
  }
}