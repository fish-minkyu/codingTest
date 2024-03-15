import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(System.in));

    int T = Integer.parseInt(reader.readLine());

    // 컴퓨터는 총 10대
    // 마지막의 컴퓨터 번호를 출력
    for(int j=0;j<T;j++) {
      String[] arr = reader.readLine().split(" ");
      int a = Integer.parseInt(arr[0]);
      int b = Integer.parseInt(arr[1]);
      int c= 0;
      int answer = 1;

      if(a%10 == 0 || a%10 == 1 || a%10 == 5 || a%10 == 6) {
        answer= a % 10;
      }else if(a%10 == 4 || a%10 == 9) {
        c = b % 2;
        if (c==0) c=2;
      }else {
        c = b % 4;
        if (c==0) c = 4;
      }

      for (int i = 0; i<c; i++) answer = (answer * a) % 10;
      if (answer == 0) answer = 10;
      System.out.println(answer);
    }
    reader.close();
  }
}

