class Solution {
  public static int solution(int[] num_list) {
    int sum = 0;
    int multiple = 1;
    // for문
    for (int i = 0; i < num_list.length; i++) {
      // 더하기
      sum += num_list[i];
      // 곱하기
      multiple *= num_list[i];
    }

    // 삼항 연산자
    return multiple < sum * sum ? 1 : 0;
  }
}