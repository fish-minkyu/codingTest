import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        // 반복문은 사용불가 (배열의 길이가 너무 길어서..)
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String call : callings) {
            // 뒷순위 구하기
            int back = map.get(call);
            // 앞순위 구하기
            int front = back -1;
            
            // map 업데이트
            map.put(call, front);
            map.put(players[front], back);
            
            // 배열도 업데이트
            String temp = players[front];
            players[front] = call;
            players[back] = temp;
        }

        return players;
    }
}