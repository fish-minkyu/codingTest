import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader
      = new BufferedReader(new InputStreamReader(System.in));

    // 반복문1. 1 ~ 30까지의 배열을 만든다.
    List<Integer> arr = new ArrayList<>(30);

    for (int i = 0; i < 30; i++) {
      arr.add(i+1);
    }

    // 반복문2. 입력값을 받되 배열에 있는 일치값이면 -1로 바꿔준다.
    for (int j = 0; j < 28; j++) {
      int student = Integer.parseInt(reader.readLine());

      if (arr.contains(student)) {
        arr.set(student-1, -1);
      }
    }

//    System.out.println(!arr.get(1).equals(-1));
    // 반복문3. 배열 전체를 순회하는데 -1이 아닌 값만 print해준다.
    for (int z = 0; z < arr.size(); z++) {
      if (!arr.get(z).equals(-1)) {
        System.out.println(arr.get(z));
      }

    }
  }
}
