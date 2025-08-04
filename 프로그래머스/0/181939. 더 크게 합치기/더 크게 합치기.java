class Solution {
    public int solution(int a, int b) {
        StringBuilder sb1 = new StringBuilder();
        String str1 = sb1.append(a).append(b).toString();

        StringBuilder sb2 = new StringBuilder();
        String str2 = sb2.append(b).append(a).toString();
        
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        
        return num1 > num2 ? num1 : num2;
    }
}