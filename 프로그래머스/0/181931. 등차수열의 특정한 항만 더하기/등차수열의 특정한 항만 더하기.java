class Solution {
    public int solution(int a, int d, boolean[] included) {
        int result = 0;
        for (int i = 0; i < included.length; i++) {
            // false일 시, continue
            if (!included[i]) continue;
            
            result += formula(a, d, i);
        }
        
        return result;
    }
    
    public int formula(int a, int d, int n) {
        return d * n + a;
    }
}