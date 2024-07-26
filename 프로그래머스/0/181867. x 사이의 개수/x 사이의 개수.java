import java.util.*;

class Solution {
    public Integer[] solution(String myString) {
        return Arrays.stream(myString.split("x", -1)).map(String::length).toArray(Integer[]::new);
    }
}