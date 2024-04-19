class Solution {
  public String solution(String my_string, int[][] queries) {
    StringBuilder sb = new StringBuilder(my_string);
    
    for (int i = 0; i < queries.length; i++) {
      // 1. 먼저 바꿀 문자열을 잘라 StringBuilder를 선언한다.
      StringBuilder flag = new StringBuilder(sb.substring(queries[i][0], queries[i][1] +1));
      // 2. reverse()로 바꿔준다.
      flag.reverse();
      // 3. 원본 StringBuilder을 바꿀 문자열의 길이만큼 인덱싱하여 replace 한다.
      sb.replace(queries[i][0], queries[i][1] +1, flag.toString());
    }

    return sb.toString();
  }
}