import java.io.*;

public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader br 
        = new BufferedReader(new InputStreamReader(System.in));
    
    String[] init = br.readLine().split(" ");
    String str1 = init[0];
    String str2 = init[1];
    
    System.out.println(str1 + str2);
  }
}