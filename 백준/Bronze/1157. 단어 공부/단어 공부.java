import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(System.in));

    // 입력값이 대문자이므로 모든 알파벳을 대문자로 변환
    String input = reader.readLine().toUpperCase();
    // A ~ Z는 총 26개, int 26크기의 배열 선언
    int[] arr = new int[26];

    // 입력 문자열 길이만큼 반복문 실행 -> 입력 문자열 한 글자씩, 해당 알파벳 순서의 int배열 count 값 증가
    for (int i = 0; i < input.length(); i++) {
      int count = input.charAt(i) - 'A';
      arr[count]++;
    }

    // 알바펫 개수(= 배열크기)만큼 반복문 실행 -> 가장 큰 값이 중복이 되었는지 비교하며 max에 저장
    // 중복값이 없다면 해당 위치 알파벳을 알아내기 위해 (index + 'A')
    // ex) 1 + 'A' => 1 + 65 => 66, 66은 'B'에 해당
    int max = 0;
    char answer = '?';
    for (int i = 0; i < arr.length; i++) {
      if (max < arr[i]) {
        max = arr[i];
        answer = (char)(i + 'A');
      } else if (max == arr[i]) answer = '?';
    }
    
    System.out.println(answer);
  }
}
