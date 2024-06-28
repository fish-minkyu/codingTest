class Solution {
  public String solution(String my_string, String alp) {
    StringBuilder sb = new StringBuilder();

    for (String str : my_string.split("")) {
      System.out.println(str);
      if (!str.equals(alp)) sb.append(str);
      else sb.append(str.toUpperCase());
    }

    return sb.toString();
  }
}