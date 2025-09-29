import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 1. 파일 이름의 개수를 입력받고, 비교 기준이 되는 comparison도 입력받는다.
        int N = Integer.parseInt(reader.readLine());
        char[] comparison = reader.readLine().toCharArray();
        
        // 2. N - 1(먼저 입력받은 comparison 제외)만큼 반복문을 돈다.
        for (int i = 0; i < N-1; i++) {
            char[] control = reader.readLine().toCharArray();
            for (int j = 0; j < control.length; j++) {
                // 3. comparison과 입력받은 control을 비교해 서로 다른 값이 있다면 '?'로 변경한다.
                if (comparison[j] != control[j]) comparison[j] = '?';
            }
        }
        
        // 4. 변경된 comparison을 출력한다.
        System.out.println(comparison);
    }
}