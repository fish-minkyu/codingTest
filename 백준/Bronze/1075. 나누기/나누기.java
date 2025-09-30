import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        int F = Integer.parseInt(reader.readLine());

        // N의 마지막 두 자리를 00으로 만듭니다.
        // 예를 들어 N=275면 200, N=1021이면 1000이 됩니다.
        int baseN = (N / 100) * 100;

        int result = 0;
        // 0부터 99까지 숫자를 변경하며 F로 나누어떨어지는지 확인합니다.
        for (int i = 0; i < 100; i++) {
            // baseN에 i를 더한 숫자가 F로 나누어떨어지는지 확인
            if ((baseN + i) % F == 0) {
                result = i; // 나누어떨어지면 그 i가 우리가 찾는 마지막 두 자리가 됩니다.
                break; // 가장 작은 i를 찾아야 하므로 찾으면 바로 반복문을 종료합니다.
            }
        }

        // 결과는 두 자리로 출력해야 합니다. 한 자리 수면 앞에 0을 붙입니다.
        // 예를 들어 0이면 "00", 2면 "02", 15면 "15"
        System.out.printf("%02d%n", result);
    }
}