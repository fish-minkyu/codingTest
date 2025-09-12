import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // 최대 이익을 저장하는 정적 변수
    public static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int[][] councils = new int[N+1][];
        for (int i = 0; i < N; i++) {
            String[] councilInfo = reader.readLine().split(" ");
            councils[i] = new int[] {
                Integer.parseInt(councilInfo[0]),
                Integer.parseInt(councilInfo[1])
            };
        }

        schedule(N, councils, 0, 0);

        System.out.println(max);
    }

    // 어떤 날들에 일할지를 조합하는 재귀함수다.
    // 단, 하루 선택에 따라 선택지가 줄어드는 정도가 일반 조합과 다르다.
    public static void schedule(
        // 퇴사해야 되는 날이다. currentDay가 이 날짜에 도달하면 재귀 종료.
        int maxDays,
        // 상담 일정이다. 정적 전역 변수로 전환 가능
        int[][] councils,
        // 오늘이다. 이 날에 상담을 받을지 말지
        int currentDay,
        // 이때까지 이득이다. 일을 했는지 안했는지에 따라 달라진다.
        int currentPay
    ) {
        // 퇴사일이다.
        if (currentDay == maxDays) {
            // 정산한다.
            max = Math.max(max, currentPay);
        }
        // 오늘 일하면 퇴사일을 넘긴다.
        else if (currentDay + councils[currentDay][0] > maxDays) {
            // 내일을 기약하자.
            schedule(maxDays, councils, currentDay + 1, currentPay);
        }
        // 오늘 일을 할지는 선택할 수 있다.
        else {
            // 일을 해보자.
            // 걸린 시간만큼을 더해줌으로써 다음에 일을 할 수 있는 날을 관리한다.
            schedule(
                maxDays,
                councils,
                currentDay + councils[currentDay][0],
                currentPay + councils[currentDay][1]
            );

            // 하지말자
            schedule(
                maxDays,
                councils,
                currentDay + 1,
                currentPay
            );
        }
    }
}