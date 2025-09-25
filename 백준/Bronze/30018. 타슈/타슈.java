import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 자전거를 다른 곳으로 옮겨야 함은
        // 어떤 대여소는 1개가 더 많고 나머지 대여소는 1개가 더 적다는 뜻이다.
        // 따라서, a리스트와 b리스트의 값을 서로 빼서 절대값으로 더한 값을 2로 나누면 된다.
        int N = Integer.parseInt(reader.readLine());
        String[] a = reader.readLine().split(" ");
        String[] b = reader.readLine().split(" ");

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            int sub = Integer.parseInt(a[i]) - Integer.parseInt(b[i]);
            sum += Math.abs(sub);
        }
        
        System.out.println(sum / 2);
    }
}