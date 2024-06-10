import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int num = Integer.parseInt(br.readLine());
    if (num % 2 == 0) System.out.println(num + " is even");
    else System.out.println(num + " is odd");
  }
}