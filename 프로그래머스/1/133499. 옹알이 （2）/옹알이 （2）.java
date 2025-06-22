import java.util.regex.Pattern;

class Solution {
    public int solution(String[] babbling) {
        // 발음 가능한 단어들
        String[] possibleArr = {"aya", "ye", "woo", "ma"};

        // 연속해서 발음할 수 없는 단어들
        String[] forbiddenWords = {"ayaaya", "yeye", "woowoo", "mama"};

        int result = 0;
        for (String word : babbling) {
            // 1. 연속해서 발음할 수 없는 단어들을 거른다.
            boolean isForbidden = false;
            for (String forbidden : forbiddenWords) {
                if (word.contains(forbidden)) { // 단어에 금지된 연속 발음이 포함이 되어 있다면
                    isForbidden = true;
                    break; // 더 이상 확인할 필요 없이 반복 중단
                }
            }

            // 금지된 발음이 있으므로 다음 단어로 넘어간다.
            if (isForbidden) continue;;

            // 2. 발음 가능한 단어들을 모두 공백으로 치환한다.
            for (String possible : possibleArr) {
                // Pattern.quote()는 possible 문자열이 정규식의 특별한 의미를 가지지 않고
                // 리터럴 문자열로 인식되도록 한다.
                word = word.replaceAll(Pattern.quote(possible), " ");
            }

            // 3. 모든 발음 가능한 단어를 제거한 후, 남은 문자열이 공백만으로 이루어져 있는지 확인한다.
            // trim()으로 앞뒤 공백을 제거한 후, 문자열이 비어있는지 확인.
            if (word.trim().isEmpty()) result++;
        }

        return result;
    }
}