public class Solution {
  public static StringBuilder solution(String my_string, int m, int c) {
    // round
    int round = my_string.length() / m;
    // 2차원 배열
    Character[][] character = new Character[m][round]; // [4][5]
    // StringBuilder
    StringBuilder result = new StringBuilder();

    // 이중 반복문 - 이차원 배열 값 넣기
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < round; j++) {
        character[i][j] = my_string.charAt(m * j + i);
      }
    }

    // 합치기
    for (int i = 0; i < character[c -1].length; i++) {
      result.append(character[c -1][i]);
    }

    return result;
  }

  public static void main(String[] args) {
    String my_string = "ihrhbakrfpndopljhygc";
    int m = 4;
    int c = 2;
    System.out.println(solution(my_string, m, c));
  }
}