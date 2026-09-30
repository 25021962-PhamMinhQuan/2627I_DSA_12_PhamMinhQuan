import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class w3_tailop_masv {
    private static int precedence(String op) {
        switch (op) {
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            default:
                return -1;
        }
    }

    public static String infixToPostfix(String expression) {
        StringBuilder result = new StringBuilder();
        Stack<String> stack = new Stack<>();

        List<String> tokens = new ArrayList<>();
        Matcher matcher = Pattern.compile("\\d+|\\+|\\-|\\*|\\/|\\(|\\)|\\w+").matcher(expression);
        while (matcher.find()) {
            tokens.add(matcher.group());
        }

        for (String token : tokens) {
            if (token.matches("[a-zA-Z0-9]+")) {
                result.append(token).append(" ");
            }
            else if (token.equals("(")) {
                stack.push(token);
            }
            else if (token.equals(")")) {
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    result.append(stack.pop()).append(" ");
                }
                if (!stack.isEmpty() && stack.peek().equals("(")) {
                    stack.pop();
                }
            }
            else {
                while (!stack.isEmpty() && !stack.peek().equals("(") &&
                        precedence(stack.peek()) >= precedence(token)) {
                    result.append(stack.pop()).append(" ");
                }
                stack.push(token);
            }
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop()).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String[] expressions = {
                "A + B * C",
                "( A + B ) * C",
                "A * B + C / D",
                "10 + 20 * ( 30 - 5 ) / 5"
        };

        for (String expr : expressions) {
            System.out.println("Trung tố (Infix) : " + expr);
            System.out.println("Hậu tố (Postfix) : " + infixToPostfix(expr));
        }
    }
}