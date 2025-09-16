import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(reader.readLine());
        for (int i = 0; i < count; i++) {
            String str = reader.readLine();

            StringBuilder answer = new StringBuilder();
            answer.append(str.charAt(0)).append(str.charAt(str.length() - 1));
            System.out.println(answer);
        }
    }
}