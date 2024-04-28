import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader
        = new BufferedReader(new InputStreamReader(System.in));

    BigInteger a = new BigInteger(reader.readLine());
    BigInteger b = new BigInteger(reader.readLine());
    
    System.out.println(a.add(b));
    System.out.println(a.subtract(b));
    System.out.println(a.multiply(b));
  }
}