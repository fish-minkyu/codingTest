import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] info = reader.readLine().split(" ");
        int N = Integer.parseInt(info[0]);
        int K = Integer.parseInt(info[1]);

        List<Integer> measure = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) measure.add(i);
        }

        System.out.println(measure.size() >= K ? measure.get(K-1) : 0);
    }
}