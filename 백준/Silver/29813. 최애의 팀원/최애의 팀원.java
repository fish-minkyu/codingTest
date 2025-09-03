import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // 학생의 숫자 입력.
        int N = Integer.parseInt(reader.readLine());
        
        // 이름과 학번을 저장할 큐 생성.
        Queue<String> names = new LinkedList<>();
        Queue<Integer> schoolNums = new LinkedList<>();
        // 학생의 수만큼 정보가 들어올테니 그만큼 반복
        for (int i = 0; i < N; i++) {
            String[] info = reader.readLine().split(" ");

            names.offer(info[0]);
            schoolNums.offer(Integer.parseInt(info[1]));
        }

        // 한명이 남을 때까지 반복한다.
        while (names.size() > 1 && schoolNums.size() > 1) {
            // 제일 앞의 애가 선택할거니, 얘는 주인공의 팀원이 될 수 없다.
            names.poll();
            // 이 학생의 학번을 가져온다.
            int schoolNum = schoolNums.poll();
            // 학번 -1만큼 패스한다.
            for (int i = 0; i < schoolNum -1; i++) {
                names.offer(names.poll());
                schoolNums.offer(schoolNums.poll());
            }
            // 다음 학생이 앞선 학생의 팀원이다.
            names.poll();
            schoolNums.poll();
            // 두 학생 모두 기록할 필요가 없다.
        }

        System.out.println(names.poll());
    }
}