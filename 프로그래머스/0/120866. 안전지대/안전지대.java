import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        // 위험 지역을 표시할 2차원 배열 (0: 안전, 1: 위험)
        int[][] dangerousMap = new int[n][n]; 

        // {좌상단, 상단, 우상단, 좌측, 우측, 좌하단, 하단, 우하단} 순서
        int[] dY = {-1, -1, -1,  0,  0,  1,  1,  1}; // row 변화량
        int[] dX = {-1,  0,  1, -1,  1, -1,  0,  1}; // column 변화량

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 지뢰를 발견하면
                if (board[i][j] == 1) {
                    // 1. 지뢰가 있는 곳 자체도 위험 지역입니다.
                    dangerousMap[i][j] = 1;

                    // 2. 8방향 주변 지역도 위험 지역으로 표시합니다.
                    for (int k = 0; k < dY.length; k++) {
                        int y = i + dY[k];
                        int x = j + dX[k];
                        
                        // y, x의 값이 board 안에 있는지 확인
                        boolean withInHeight = 0 <= y && y < n;
                        boolean withInWidth = 0 <= x && x < n;

                        // 범위 안에 있다면 위험 지역으로 표시
                        if (withInHeight && withInWidth) {
                            dangerousMap[y][x] = 1;
                        }
                    }
                }
            }
        }

        int safeAreaCount = 0;
        // dangerousMap을 순회하며 안전 지역(0으로 표시된 곳)의 개수를 셉니다.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (dangerousMap[i][j] == 0) {
                    safeAreaCount++;
                }
            }
        }

        return safeAreaCount;
    }
}