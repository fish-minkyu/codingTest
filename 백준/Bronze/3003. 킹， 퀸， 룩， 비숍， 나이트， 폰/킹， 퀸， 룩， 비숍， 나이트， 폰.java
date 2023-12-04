import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException { // IOException는 문제를 풀다가 잘못 입력했을 경우를 대비한 오류다.
    // 어떤 입력에 대하여 버퍼링 기능 제공(한 번에 많은 데이터를 읽게 들이는 클래스)
    // 가장 빠르게 입력 받을 수 있는 방법
    BufferedReader reader
      = new BufferedReader(new InputStreamReader(System.in));
    // readLine을 통해 한줄 입력 받기
    String input = reader.readLine(); // 여러 줄의 복수입력이 들어오면 readline을 여러 번 쓰면 된다.
    // ------------------------------------------------------------

    // split은 주어진 인자를 정규표현식으로 활용해서 기준을 삼아
    // 문자열을 나눈 배열로 반환한다.
    String[] splitString = input.split(" ");
//    for (String split : splitString) {
//      System.out.println(split);
//    }

    // 3003 문제 풀어보기

    // 1. 기준이 되는 체스말을 정수 배열로 저장
    int[] rightPieces = {1 , 1, 2, 2, 2, 8};
    // 2. 입력받은 각각의 체스말을 살펴본다.
    // 어떤 말인지를 보기 위해 fori 반복을 한다.
    for (int i = 0; i < 6; i++) {
      // 3. i번 말을 확인한다.
      String pieceRaw = splitString[i];
      // 4. 동이랗ㄴ 말에서, 기준 갯수와 다른 만큼 빼준다.
      // "java string 정수로" 검색
      rightPieces[i] -= Integer.parseInt(pieceRaw);
    }

    System.out.println(String.format(
      "%d %d %d %d %d %d",
      rightPieces[0],
      rightPieces[1],
      rightPieces[2],
      rightPieces[3],
      rightPieces[4],
      rightPieces[5]
    ));
  }
}