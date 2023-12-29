import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

import static java.util.Arrays.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader
      = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(reader.readLine());
    String[] strings = reader.readLine().split(" ");

    int[] subject = new int[N];

    for (int i = 0; i < N; i++) {
      subject[i] = Integer.parseInt(strings[i]);
    }

    Arrays.sort(subject);
    double sum = 0;
    for (int j = 0; j < N; j++) {
      sum += (double) subject[j] / subject[N -1] * 100;
    }

    double avg = (double) sum / N;
    System.out.println(avg);
  }
}
