class Solution {
  public int solution(String number) {
    int sum = 0;
    // split을 해준다.
    String[] arr = number.split("");
    // 반복문을 통해 숫자로 바꾼뒤 다 더한다.
    for (int i = 0; i < arr.length; i++) {
      sum += Integer.parseInt(arr[i]);
    }
    // 9로 나눠준다.
    return sum % 9;
  }
}