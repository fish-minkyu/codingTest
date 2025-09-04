import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // 이 코드에서는 받아야 하는 정보가 여러번 등장하는데, 이 변수를 재활용해서 활용한다.
        String[] baseInfo = reader.readLine().split(" ");
        // 손님 수
        int customerCount = Integer.parseInt(baseInfo[0]);
        // 서빙될 초밥의 수
        int servingCount =  Integer.parseInt(baseInfo[1]);
        // 초밥을 기다리는 손님을 담기 위한 Map
        Map<Integer, Queue<Integer>> waiting = new HashMap<>();

        // 손님의 수만큼 반복한다.
        for (int i = 0; i < customerCount; i++) {
            // 정보를 받아 살펴보고,
            baseInfo = reader.readLine().split(" ");
            // 이 손님이 원하는 초밥의 갯수를 받아와
            int sushiCount = Integer.parseInt(baseInfo[0]);
            // 그 크기만큼 순회한다.
            for (int j = 0; j < sushiCount; j++) {
                // 다음 칸부터 초밥의 정보가 나오는데,
                int sushi = Integer.parseInt(baseInfo[j + 1]);
                // 만약 아직 주문된 적 없는 초밥이라면
                if (waiting.get(sushi) == null) {
                    // 새로운 Queue를 생성한다.
                    waiting.put(sushi, new LinkedList<>());
                }
                // 그리고 손님을 초밥 큐에 넣어준다.
                waiting.get(sushi).add(i);
            }
        }

        // 나올 초밥들을 저장해둔다.
        int[] sushiOut = Arrays.stream(reader.readLine().split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();
        // 각 손님이 몇개를 먹었는지 확인하기 위한 배열
        int[] customerAte = new int[customerCount];

        // 각 초밥을 확인해보자.
        for (int sushi : sushiOut) {
            // 이 초밥을 원하는 손님들을 담은 큐를 회수한다.
            Queue<Integer> thisWaiter = waiting.get(sushi);
            // 여기에 큐가 없거나 비어있다면, 이 초밥은 더 이상 원하는 사람이 없다는 뜻
            if (thisWaiter == null || thisWaiter.isEmpty()) continue;
            // 큐의 가장 앞의 손님을 찾는다.
            int eatingCustomer = thisWaiter.poll();
            // 그 손님이 먹은 갯수 하나 증가한다.
            customerAte[eatingCustomer]++;
        }
        
        // 결과 출력
        StringBuilder answer = new StringBuilder();
        for (int ateCount : customerAte) {
            answer.append(ateCount).append(" ");
        }
        System.out.println(answer);
    }
}