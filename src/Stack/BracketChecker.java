package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BracketChecker {
    public boolean checkBracket() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        Stack<Character> charStack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
             char next = input.charAt(i);

             if (next == '(') charStack.push(next);
             else if (next == ')') {
                 if (charStack.isEmpty()) return false;
                 char top = charStack.pop();
                 if (top != '(') return false;
             }
        }
        return charStack.isEmpty();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new BracketChecker().checkBracket());
    }
}
