import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;


public class Main {
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      String[] myCardString = br.readLine().split(" ");
      
      // Set 사용
      Set<Integer> myCards = new HashSet<>();
      for (int i = 0; i < N; i++) {
          myCards.add(Integer.parseInt(myCardString[i]));
      }

      int M = Integer.parseInt(br.readLine());
      String[] targetCards = br.readLine().split(" ");
      
      StringBuilder answer = new StringBuilder();
      
      for (int i = 0; i < M; i++) {
        int result = myCards.contains(Integer.parseInt(targetCards[i])) ? 1 : 0;
        answer.append(result).append(" ");
      }

      System.out.println(answer);
  }
}
