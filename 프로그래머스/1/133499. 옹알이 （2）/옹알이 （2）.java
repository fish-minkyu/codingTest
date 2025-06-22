import java.util.regex.Pattern;

class Solution {
    public int solution(String[] babbling) {
        // 발음 가능한 단어들
        String[] canSayArr = {"aya", "ye", "woo", "ma"};
        // 연속해서 발음할 수 없는 단어들
        String[] forbiddenConsecutive = {"ayaaya", "yeye", "woowoo", "mama"};

        int result = 0; // 발음 가능한 단어의 개수

        // 주어진 모든 옹알이 단어에 대해 반복
        for (String word : babbling) {
            // 1. 먼저 연속해서 같은 발음이 있는지 확인
            boolean isForbidden = false;
            for (String forbidden : forbiddenConsecutive) {
                if (word.contains(forbidden)) { // 단어에 금지된 연속 발음이 포함되어 있다면
                    isForbidden = true;
                    break; // 더 이상 확인할 필요 없이 반복 중단
                }
            }
            if (isForbidden) {
                continue; // 금지된 발음이 있으므로 다음 단어로 넘어감
            }

            // 2. 발음 가능한 단어들을 모두 공백으로 치환
            // Pattern.quote()는 canSay 문자열이 정규식의 특별한 의미를 가지지 않고
            // 리터럴 문자열로 인식되도록 합니다.
            for (String canSay : canSayArr) {
                word = word.replaceAll(Pattern.quote(canSay), " ");
            }

            // 3. 모든 발음 가능한 단어를 제거한 후, 남은 문자열이 공백만으로 이루어져 있는지 확인
            // trim()으로 앞뒤 공백을 제거한 후, 문자열이 비어있는지 확인
            if (word.trim().isEmpty()) {
                result++; // 비어있다면 올바른 옹알이이므로 개수 증가
            }
        }

        return result;
    }
}
