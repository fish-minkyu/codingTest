class Solution {
  public String solution(String cipher, int code) {
    String[] arr = cipher.split("");
    StringBuilder sb = new StringBuilder();

    for (int idx = code -1; idx < arr.length; idx+= code) {
      sb.append(arr[idx]);
    }

    return sb.toString();
  }
}