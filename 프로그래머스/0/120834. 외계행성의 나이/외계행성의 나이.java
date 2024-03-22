public class Solution {
  public String solution(int age) {
    String[] list = {
      "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"
    };

    // age를 한자리 숫자로 나눈다.
    String[] arr = String.valueOf(age).split("");
    String ans = "";
    for (int i = 0; i < arr.length; i++) {
      ans += list[Integer.parseInt(arr[i])];
    }

    return ans;
  }

  public static void main(String[] args) {

    System.out.println(new Solution().solution(23));
  }
}