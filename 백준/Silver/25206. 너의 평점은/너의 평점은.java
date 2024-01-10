import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(System.in));

    // 과목 표를 Map으로 구현한다.
    Map<String, Double> gradeTable = new HashMap<>();
    gradeTable.put("A+", 4.5);
    gradeTable.put("A0", 4.0);
    gradeTable.put("B+", 3.5);
    gradeTable.put("B0", 3.0);
    gradeTable.put("C+", 2.5);
    gradeTable.put("C0", 2.0);
    gradeTable.put("D+", 1.5);
    gradeTable.put("D0", 1.0);
    gradeTable.put("F", 0.0);

    // 분자, (학점 * 치훈 등급) 총합
    double sum1 = 0.0;
    // 분모, 학점 총합
    double sum2 = 0.0;

    // 반복문
    // 평균: (학점 * 치훈 등급) 총합 / 학점 총합
    for (int i = 0; i < 20; i++) {
      // StringToken 사용, 과목명 / 과목별 학점 / 과목평점
      StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
      String subject = st.nextToken();
      Double score = Double.valueOf(st.nextToken());
      
      // P인 것을 제외하려고 flag를 세워둔다.
      String flag = st.nextToken();

      // 만약 P가 온다면 0점인 F로 바꿔 0점으로 제외, 학점 총합도 그만큼 빼서 제외해준다.
      if (flag.equals("P")) {
        flag = "F";
        sum2 -= score;
      }

      Double grade = gradeTable.get(flag);

      sum1 += score * grade;
      sum2 += score;
    }

    // 평균
    double avg = sum1 / sum2;

    System.out.println(avg);
  }
}
