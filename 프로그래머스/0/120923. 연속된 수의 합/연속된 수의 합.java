class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int mid = total / num;
        // 첫째항을 구하는 공식. (단, 등차가 1인 특수한 등차수열)
        // : (total / num) - (num - 1) / 2
        int first = mid - (num -1) / 2;

        for (int i = 0; i < num; i++) {
            answer[i] = first + i;
        }

        return answer;
    }
}