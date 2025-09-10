import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static String solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] info = reader.readLine().split(" ");
        int a = Integer.parseInt(info[0]);
        int b = Integer.parseInt(info[1]);
        int c = Integer.parseInt(info[2]);
        int d = Integer.parseInt(info[3]);
        int e = Integer.parseInt(info[4]);
        int f = Integer.parseInt(info[5]);

        // 얼핏 보면 연립 방정식을 풀고 싶지만, 숫자가 몇개 되지 않는다.
        // 1999가지 숫자 중 중복을 허용하여 2개의 숫자를 뽑는다.
        for (int i = -999; i < 1000; i++) {
            for (int j = -999; j < 1000; j++) {
                // 요구하는 연립방정식이 맞는지를 확인한다.
                if (a * i + b * j == c && d * i + e * j == f) {
                    return i + " " + j;
                }
            }
        }

        return "0 0";
    }

    public static void main(String[] args) throws IOException {
        System.out.println(solution());
    }
}