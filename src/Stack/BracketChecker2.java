package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BracketChecker2 {
    public boolean checkBracket() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        Stack<Character> charStack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char next = input.charAt(i);
            switch (next) {
                case '(', '[', '{' : // 여는 괄호 Stack push
                    charStack.push(next);
                    break;
                case ')', ']', '}' : // 닫는 괄호 검사
                    if (charStack.isEmpty()) return false; // 여는 괄호가 하나도 없다면 false
                    else {
                        char top = charStack.pop(); // Stack 최상단의 여는 괄호 pop
                        if (top == '(' && next != ')' || top == '[' && next != ']' || top == '{' && next != '}') return false;
                        // pop 한 여는 괄호가 현재 들어 온 닫는 괄호와 같은 종류의 괄호인지 비교
                    }
                    break;
            }
        }
        return charStack.isEmpty(); // 모든 괄호가 짝이 맞아 Stack 이 비었는지?
    }

    public static void main(String[] args) throws IOException {
        BracketChecker2 bracketChecker2 = new BracketChecker2();
        System.out.println(bracketChecker2.checkBracket());
    }
}
