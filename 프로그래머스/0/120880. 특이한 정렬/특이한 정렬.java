import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Integer[] integers = Arrays.stream(numlist) // int[]를 Integer[]로 변환
                                   .boxed()
                                   .toArray(Integer[]::new);

        Arrays.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int diff1 = Math.abs(o1 - n);
                int diff2 = Math.abs(o2 - n);
                if (diff1 == diff2) {
                    return o2 - o1; // 차이가 같다면 더 큰 숫자를 앞으로
                }
                return diff1 - diff2; // 차이가 작은 순서대로
            }
        });

        // 결과를 다시 int[]로 변환
        for (int i = 0; i < integers.length; i++) {
            numlist[i] = integers[i];
        }

        return numlist;
    }
}