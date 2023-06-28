package Stack;

import java.util.ArrayList;
import java.util.Scanner;

public class PostFixCalculatorMain {
    public static void main(String[] args) {
        PostFixCalculator postFixCalculator = new PostFixCalculator();
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        ArrayList<String> strings = new ArrayList<>();

        strings = postFixCalculator.inFixToPostFix(inputString);
        int total = postFixCalculator.postFix(postFixCalculator.inFixToPostFix(inputString));
        System.out.println(strings);
        System.out.println(total);
    }
}
