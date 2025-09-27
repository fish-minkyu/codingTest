import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       int N = Integer.parseInt(reader.readLine());
       String[] info = reader.readLine().split(" ");

       List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < info.length; i++) {
            int flag = Integer.parseInt(info[i]);

            if (flag > 1) {
                List<Integer> tmp = new ArrayList<>();
                for (int j = 1; j <= flag; j++) {
                    if (flag % j == 0) {
                        tmp.add(j);
                    }

                }
                if (tmp.size() == 2) answer.add(flag);;
            }
        }

        System.out.println(answer.size());
    }
}