import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(System.in));
    
    int N = Integer.parseInt(reader.readLine());
    int count = 0;

    for (int i = 0; i < N; i++) {
      if (checkStr(reader.readLine())) count++;
    }
    
    reader.close();
    System.out.println(count);
  }
  
  // Method로 빼기, 입력받을 때마다 그룹문자인지 확인한다.
  static boolean checkStr(String str) {
    
    // a ~ z, 총 26개의 boolean 배열 생성
    boolean[] checkAlpha = new boolean[26];
    // 이전 문자의 인덱스 값을 지정하는 변수
    int prev = -1;

    // 입력받은 문자열의 개수만큼 반복
    for (int i = 0; i < str.length(); i++) {
      // Ex. a - 97 = 0, b - 97 = 1
      int now = str.charAt(i) - 97;
      
      // 이전 문자와 i번째 문자가 같지 않다면 boolean 배열의 값을 확인한다.
      if (prev != now) { // -1 != 0
        // i번째 배열의 값이 false이면 처음 나온 문자라는 것이다.
        if (checkAlpha[now] == false) {
          // 처음 나왔으므로 다음에 나오면 두번째로 나온 문자임으로 true로 바꿔준다.
          checkAlpha[now] = true;
          // 이전 문자와 계속 비교해야 하므로 재할당을 해준다.
          prev = now;
        }
        // a != b라면 true가 되고, b의 인덱스를 확인해봤는데 true라면 else문으로 오게된다.
        // 즉, b는 이전에 한번 등장했던 것이므로 그룹문자가 아니다. false를 반환해준다.
        else return false;
      }
      // n != n은 false가 되고, 그 뜻은 이전문자도 n 지금 문자도 n인 연속 문자를 뜻하므로 continue를 해준다.
      else continue;
    }
    // 문제가 없다는 것은 그룹문자이므로 true를 반환해준다.
    return true;
  }
}
