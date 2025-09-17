import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        String[] info = reader.readLine().split("");

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(info[i]);
        }

        System.out.println(sum);
    }
}