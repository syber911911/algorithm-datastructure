package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class PostFixCalculatorBasic {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        Stack<Integer> digitStack = new Stack<>();

        for (String token : input.split("")){
            if ("+-*/".contains(token)) { // 현재 읽은 token 이 연산자라면
                int val2 = digitStack.pop(); // stack 상단 두개 피연산자에 대해 해당 연산 수행
                int val1 = digitStack.pop();
                if (token.equals("+")) {
                    digitStack.push(val1 + val2);
                } else if (token.equals("-")) {
                    digitStack.push(val1 - val2);
                } else if (token.equals("*")) {
                    digitStack.push(val1 * val2);
                } else if (token.equals("/")) {
                    digitStack.push(val1 / val2);
                }
            } else { // 연산자가 아니라면 push
                digitStack.push(Integer.parseInt(token));
            }
        }
        System.out.println(digitStack.pop()); // stack 에 남은 연산 결과를 출력
    }

    public static void main(String[] args) throws IOException {
        new PostFixCalculatorBasic().solution();
    }
}
