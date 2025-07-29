class Solution {
    public int[] solution(String[] park, String[] routes) {
        // 델타 탐색
        int[][] deltas = new int[][] {
            // N
            {-1, 0},
            // S
            {1, 0},
            // W
            {0, -1},
            // E
            {0, 1}
        };

        // 공원 크기
        int height = park.length;
        int width = park[0].length();

        // 공원 만들기
        char[][] playground = new char[park.length][];
        for (int i = 0; i < park.length; i++) {
            playground[i] = park[i].toCharArray();
        }

        // 시작지점 찾기
        // answer[0] = i => height
        // answer[1] = j => width
        int[] answer = new int[2];
        for (int i = 0; i < height; i++) {
                boolean found = false;
            for (int j = 0; j < width; j++) {
                if (found) break;

                if (playground[i][j] == 'S') {
                    answer[0] = i;
                    answer[1] = j;
                    found = true;
                    break;
                }
            }
            // 시작점을 찾았으므로 반복문 종료
            if (found) break;
        }

        // routes에 따라 맞게 이동
        for (String route : routes) {
            String[] arr = route.split(" ");
            String flag = arr[0];
            int distance = Integer.parseInt(arr[1]);

            int[] direction = new int[2];
            switch (flag) {
                case "N":
                    direction = deltas[0];
                    break;
                case "S":
                    direction = deltas[1];
                    break;
                case "W":
                    direction = deltas[2];
                    break;
                case "E":
                    direction = deltas[3];
                    break;
            }

            // 1. 공원 범위 내에 있는지 확인
            int x = answer[1] + direction[1] * distance;
            int y = answer[0] + direction[0] * distance;

            boolean withInWidth = 0 <= x && x < width;
            boolean withInHeight = 0 <= y && y < height;

            // 범위를 벗어나면 pass
            if (!(withInWidth && withInHeight)) continue;

            // 2. 장애물이 있는지 확인
            boolean blocked = false;
            for (int i = 1; i < distance + 1; i++) {
                char now = playground[answer[0] + direction[0] * i][answer[1] + direction[1] * i];
                if (now == 'X') {
                    blocked = true;
                    break;
                }
            }

            if (!blocked) {
                answer[1] = x;
                answer[0] = y;
            }
        }

        return answer;
    }
}