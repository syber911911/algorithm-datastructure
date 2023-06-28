package Stack;

import java.util.ArrayList;
import java.util.Stack;
public class PostFixCalculator {
    public ArrayList<String> inFixToPostFix(String expr) {
        Stack<String> stack = new Stack<>();
        ArrayList<String> outPut = new ArrayList<>();
        for(String token : expr.split(" ")){
            if(token.equals("(")){
                stack.push("(");
            }
            else if(token.equals(")")){
                while(!stack.isEmpty()){
                    String op = stack.pop();
                    if(op.equals("(")){
                        break;
                    }
                    else{
                        outPut.add(op);
                    }
                }
            }
            else if("+-*/".contains(token)){
                while(!stack.isEmpty()){
                    String op = stack.peek();
                    if(precedence(token) <= precedence(op)){
                        outPut.add(op);
                        stack.pop();
                    }
                    else{
                        break;
                    }
                }
                stack.push(token);
            }
            else{
                outPut.add(token);
            }
        }
        while(!stack.isEmpty()){
            outPut.add(stack.pop());
        }
        return outPut;
    }
    public int precedence(String op){
        if(op.equals("(") || op.equals(")")) return 0;
        else if(op.equals("+") || op.equals("-")) return 1;
        else if(op.equals("*") || op.equals("/")) return 2;
        else return -1;
    }
    public int postFix(ArrayList<String> expr){
       Stack<Integer> stack = new Stack<>();
       for (String token : expr) {
           if("+-*/".contains(token)){ // token 이 연산자면
               int val2 = stack.pop(); // stack 상단 두개 피연산자에 대해 해당 연산 수행
               int val1 = stack.pop();
               if(token.equals("+")) {
                   stack.push(val1 + val2);
               }
               else if(token.equals("-")){
                   stack.push(val1 - val2);
               }
               else if(token.equals("*")){
                   stack.push(val1 * val2);
               }
               else if(token.equals("/")){
                   stack.push(val1 / val2);
               }
           }
           else{ // 연산자가 아니라면 push
               stack.push(Integer.parseInt(token));
           }
       }
        return stack.pop(); // 수식이 끝나면 stack 에 남은 결과 값을 pop
    }
}
