import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        // 각 사람의 무게 및 키 정보를 받아두기 위한 리스트.
        List<int[]> people = new ArrayList<>(N);

        // 정보를 저장한다.
        for (int i = 0; i < N; i++) {
            String[] personalInfo = reader.readLine().split(" ");
            people.add(new int[] {
                Integer.parseInt(personalInfo[0])
                , Integer.parseInt(personalInfo[1])}
            );
        }
        // i 보다 덩치가 큰 사람의 수를 over[i]에 저장한다.
        int[] over = new int[N];
        // 두 사람씩 비교하는 문제다.
        // i는 0부터 N - 2 까지
        for (int i = 0; i < N - 1; i++) {
            // j는 i + 1부터 N까지
            for (int j = i + 1; j < N; j++) {
                int[] personA = people.get(i);
                int[] personB = people.get(j);
                if (personA[0] > personB[0] && personA[1] > personB[1]) over[j]++;
                else if (personA[0] < personB[0] && personA[1] < personB[1]) over[i]++;
            }
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < N; i++) {
            answer.append(over[i] + 1).append(" ");
        }

        System.out.println(answer);
    }
}