public class Solution {
  public int solution(int order) {
    String[] arr = String.valueOf(order).split("");
    int count = 0;

    for (int i = 0; i < arr.length; i++) {
      int num = Integer.parseInt(arr[i]);
      switch (num) {
        case 3, 6, 9:
          count++;
          break;
      }
    }
    
    return count;
  }
}