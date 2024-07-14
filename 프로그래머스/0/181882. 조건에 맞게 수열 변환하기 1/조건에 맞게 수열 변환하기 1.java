class Solution {
  public int[] solution(int[] arr) {
    int[] result = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] >= 50 && arr[i] % 2 == 0) result[i] = arr[i] / 2;
      else if (arr[i] < 50 && arr[i] % 2 == 1) result[i] = arr[i] * 2;
      else result[i] = arr[i];
    }

    return result;
  }
}