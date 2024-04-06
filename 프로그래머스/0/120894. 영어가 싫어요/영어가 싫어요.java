import java.util.Arrays;

class Solution {
  public long solution(String numbers) {
    String pocket = "";
    StringBuilder result = new StringBuilder();

    String[] num = {
        "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
    };

    for (int i = 0; i < numbers.length(); i++) {
      pocket += numbers.charAt(i);

      if (Arrays.asList(num).contains(pocket)) {
        result.append(Arrays.asList(num).indexOf(pocket));
        System.out.println(pocket);
        pocket = "";
      }
    }

    return Long.parseLong(String.valueOf(result));
  }
}