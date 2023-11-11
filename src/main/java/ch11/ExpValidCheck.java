package ch11;

import java.util.EmptyStackException;
import java.util.Stack;

public class ExpValidCheck {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ExpValid");
            System.out.println("Example : java  \"((2+3)*1+3\"");
            System.exit(0);
        }

        Stack st = new Stack();
        String expression = args[0];

        System.out.println("expression >>>" + expression);

        try {
            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);



            }

        } catch (EmptyStackException e) {
            System.out.println("괄호가 일치 X");
        }

    }
}
