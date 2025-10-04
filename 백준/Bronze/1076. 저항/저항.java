import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String first = reader.readLine();
        String second = reader.readLine();
        String third = reader.readLine();

        Map<String, Integer> valueMap = new LinkedHashMap<>();
        Map<String, Integer> multiMap = new LinkedHashMap<>();
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int multiple = 1;

        for (int i = 0; i < color.length; i++) {
            valueMap.put(color[i], i);

            multiMap.put(color[i], multiple);
            multiple *= 10;
        }

        String head = String.valueOf(valueMap.get(first)) + String.valueOf(valueMap.get(second));

        long answer = Long.parseLong(head) * multiMap.get(third);
        System.out.println(answer);
    }
}