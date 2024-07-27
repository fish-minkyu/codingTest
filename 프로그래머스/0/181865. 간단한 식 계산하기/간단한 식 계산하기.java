class Solution {
  public int solution(String binomial) {
    String[] arr = binomial.split(" ");
    int ans = 0;

    switch (arr[1]) {
      case "+":
        ans = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
        break;
      case "-":
        ans = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
        break;
      case "*": 
       ans = Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]);
       break;
    }

    return ans;
  }
}