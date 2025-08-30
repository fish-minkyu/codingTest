class Solution {
  public String solution(String my_string, int[] index_list) {
    String result = "";
    String[] arr = my_string.split("");

    for (int i = 0; i < index_list.length; i++) {
      result += arr[index_list[i]];
    }
    
    return result;
  }
}