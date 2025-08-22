import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder로 한번에 결과를 출력한다.
        StringBuilder answer = new StringBuilder();
        while (true) {
            String line = reader.readLine();
            // 입력받은 줄이 "."이면 종료한다.
            if (".".equals(line)) break;
            if (isValid(line)) answer.append("yes");
            else answer.append("no");
            answer.append('\n');
        }
        System.out.println(answer);
    }

    public static boolean isValid(String line) {
        // 괄호를 담을 스택
        Stack<Character> stack = new Stack<>();
        // 각 글자를 확인한다.
        for (char letter : line.toCharArray()) {
            // 여는 괄호 종류라면 스택에 푸시
            if (letter == '(' || letter == '[') stack.push(letter);
            // 닫는 소괄호면,
            else if (letter == ')') {
                // 비어있거나 stack의 제일 위가 여는 소괄호가 아닐 때 실패
                if (stack.empty() || stack.peek() != '(') return false;
                // 아니면 여는 소괄호 pop
                else stack.pop();
            }
            // 닫는 대괄호면
            else if (letter == ']') {
                // 비어있거나 stack의 제일 위가 여는 대괄호가 아닐 때 실패
                if (stack.empty() || stack.peek() != '[') return false;
                // 아니면 여는 소괄호 pop
                else stack.pop();
            }
        }
        // 스택이 비어있는지 여부가 결과다.
        return stack.empty();
    }
}