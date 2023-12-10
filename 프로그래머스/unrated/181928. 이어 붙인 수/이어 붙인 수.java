class Solution {
  public int solution(int[] num_list) {
    // StringBuilder 생성
    StringBuilder odd = new StringBuilder();
    StringBuilder even = new StringBuilder();
    // 반복 - 조건문 사용
    // StringBuilder를 사용해서 문자열을 더한다.
    for (int i = 0; i < num_list.length; i++) {
      if ( num_list[i] % 2 == 1) {
        odd.append(String.valueOf(num_list[i]));
      } else {
        even.append(String.valueOf(num_list[i]));
      }
    }
    Integer sum = Integer.parseInt(String.valueOf(odd)) + Integer.parseInt(String.valueOf(even));
    return sum;
  }
}