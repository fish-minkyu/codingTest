class Solution {
    public int solution(int[] num_list, int n) {
        for(int num : num_list) {
            if (num != n) continue;
            else return 1;
        }
        
        return 0;
    }
}