package pr22;

import javax.annotation.processing.SupportedSourceVersion;

public class RPNsolver {
    public static void main(String[] args) {
        String rpn1 = "94+1-95/*728/--";
        String rpn2 = "94/12+-";
        String rpn = "92-";
        Stack stack = new Stack(rpn.length());

        for (int i = 0; i < rpn.length(); i++) {
            try {
                if (isInt(String.valueOf(rpn.charAt(i)))) {
                    stack.push(Integer.parseInt(String.valueOf(rpn.charAt(i))));
                } else {
                    int x2 = stack.pop();
                    int x1 = stack.pop();
                    if (String.valueOf(rpn.charAt(i)).equals("+")) {
                        stack.push(x1 + x2);
                    } else if (String.valueOf(rpn.charAt(i)).equals("-")) {
                        stack.push(x1 - x2);
                    } else if (String.valueOf(rpn.charAt(i)).equals("*")) {
                        stack.push(x1 * x2);
                    } else if (String.valueOf(rpn.charAt(i)).equals("/")) {
                        stack.push(x1 / x2);
                    } else {
                        throw new Error();
                    }
                }
            } catch (StackEmpty | Error e) {
                System.out.println("Not possible to calculate RPN");
            }
        }
        stack.printStack();
    }

    private static boolean isInt(String s) {
        try {
            int s1 = Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
