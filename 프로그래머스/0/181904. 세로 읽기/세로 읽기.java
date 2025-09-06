class Solution {
    public static String solution(String my_string, int m, int c) {
        int round = my_string.length() / m;
        Character[][] arr = new Character[round][m];

        // 이중 반복문을 통해 2차원 배열을 만든다.
        for (int i = 0; i < round; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = my_string.charAt(m * i + j);
            }
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < round; i++) {
            answer.append(arr[i][c-1]);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        String my_string = "ihrhbakrfpndopljhygc";
        System.out.println(solution(my_string, 4, 2));
    }
}