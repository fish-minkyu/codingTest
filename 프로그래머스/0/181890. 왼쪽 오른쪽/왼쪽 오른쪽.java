import java.util.Arrays;

class Solution {
  public static String[] solution(String[] str_list) {

    for (int i = 0; i < str_list.length; i++) {
      if (str_list[i].equals("l")) return Arrays.copyOfRange(str_list, 0, i);
      if (str_list[i].equals("r")) return Arrays.copyOfRange(str_list, i +1, str_list.length);
    }

    return new String[0];
  }

  public static void main(String[] args) {
    String[] str_lsit = {"u", "u", "r", "l"};

    System.out.println(Arrays.toString(solution(str_lsit)));
  }
}