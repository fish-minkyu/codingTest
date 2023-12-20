import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    // input 값 받기
    BufferedReader reader
      = new BufferedReader(new InputStreamReader(System.in));

    String[] input = reader.readLine().split(" ");

    int hour = Integer.parseInt(input[0]);
    int minute = Integer.parseInt(input[1]);

    if (minute < 45) {
      hour = hour == 0 ? 23 : hour -1;
      minute = 60 + (minute - 45);
    } else {
      minute = minute - 45;
    }

    System.out.println(hour + " " + minute);
  }
}
