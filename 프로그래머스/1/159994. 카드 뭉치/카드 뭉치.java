class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        /*
        1. 찾을 단어와 카드 뭉치의 제일 앞에 있는 것과 비교해서 찾은 단어라면 소멸
        2. 각각의 카드뭉치의 첫째 장을 꺼내 goal의 첫째 장과 일치하는지 확인
        3. 일치하면 해당 카드뭉치는 다음 장으로 이동
        */
        int a = 0;
        int b = 0;
        for (int i = 0; i < goal.length; i++) {
            if (a < cards1.length && goal[i].equals(cards1[a])) {
                a++;
                continue;
            }

            if (b < cards2.length && goal[i].equals(cards2[b])) {
                b++;
                continue;
            }

            return "No";
        }

        return "Yes";
    }
}