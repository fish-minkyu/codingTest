import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(System.in));

    int num1 = Integer.parseInt(reader.readLine());
    int num2 = Integer.parseInt(reader.readLine());
    String strNum = String.valueOf(num2);

    for (int i = strNum.length()-1; i >= 0; i--) {
      // 중간 연산값
      System.out.println(num1 * Integer.parseInt(strNum.substring(i, i+1)));
      // charAt()은 타입이 Character여서 String을 인수로 받는 Integer.ParseInt()과 맞지 않는다.
      // 따라서, String.valueOf()를 써서 Character를 String으로 바꿔준다.
      // System.out.println(num1 * Integer.parseInt(String.valueOf(strNum.charAt(i))));
    }
    // 결과값
    System.out.println(num1 * num2);
  }
}
