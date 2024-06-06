import java.util.Arrays;

class Solution {
  public int[] solution(int[] num_list) {
    // num_list 배열보다 하나 더 큰 arr 배열 복사하기
    int[] arr = Arrays.copyOfRange(num_list, 0, num_list.length+1);
    // num_list 마지막 인덱스
    int a = num_list[num_list.length-1];
    // num_list 그전 인덱스
    int b =  num_list[num_list.length -2];
    // 삼항 연산자
    int result = a > b ? a -b : a *2;
    // 마지막 자리에 값 추가
    arr[arr.length -1] = result;

    return arr;
  }
}