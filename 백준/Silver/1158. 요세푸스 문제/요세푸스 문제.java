import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] info = reader.readLine().split(" ");
        int N = Integer.parseInt(info[0]);
        int K = Integer.parseInt(info[1]);

        // 정답을 담기 위한 리스트
        List<Integer> result = new ArrayList<>(N);
        // 요세푸스 문제 정의대로 사람을 빼기 위한
        Queue<Integer> people = new LinkedList<>();
        // 사람을 넣자, 1 ~ N까지 포함해야 한다.
        for (int i = 1; i <= N ; i++) {
            // Queue니까 offer를 쓰자
            people.offer(i);
        }

        // 현재 몇번째 사람인지를 기록한 뒤,
        int round = 1;
        // 큐가 빌때까지 반복하며
        while (!people.isEmpty()) {
            int person = people.poll();
            // 이번 사람이 탈락할 차례인지 판단
            if (round == K) {
                // 맞으면 result로
                result.add(person);
                // 초기화
                round = 1;
            } else {
                // 아니면 다시 큐로
                people.offer(person);
                round++;
            }
        }

        String resultStr = result.toString();
        resultStr = resultStr.substring(1, resultStr.length() -1);

        StringBuilder answer = new StringBuilder();
        answer.append('<');
        answer.append(resultStr);
        answer.append('>');

        System.out.println(answer);
    }
}