import java.util.Arrays;
import java.util.List;

class Solution {
  public int[] solution(int[] arr) {
    Integer[] twoArr = {2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};

    List<Integer> checkList = Arrays.asList(twoArr);

    int two = 1;


    while (arr.length > two) {
      if (checkList.contains(arr.length)) return arr;
      two *= 2;
    }

    int newLength = two;
    int[] newArr = new int[newLength];
    for (int i = 0; i < newLength; i++) {
      if (i < arr.length) newArr[i] = arr[i];
      else newArr[i] = 0;
    }

    return newArr;
  }
}