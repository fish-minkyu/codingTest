import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        String[] info = reader.readLine().split(" ");

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(info[i]));
        }

        // 약수의 값들을 오름차순으로 정렬한다.
        Collections.sort(arr);

        int answer = 0;
        // 약수의 개수가 짝수이면 처음과 끝을 곱한다.
        if (N % 2 == 0) answer = arr.get(0) * arr.get(arr.size() -1);
        // 약수의 개수가 홀수라면 중간값을 구해서 ^2한다.
        else answer = arr.get(arr.size() / 2) * arr.get(arr.size() / 2);

        System.out.println(answer);
    }
}