package src.uni.lessons.jswing.Calculator.utils;

import java.util.Stack;

public class MathExpressionParser {
    private String expression;

    public MathExpressionParser() {
        this.expression = "";
    }

    public MathExpressionParser(String expression) {
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public double evaluate() {
        // Remove any whitespace from the expression
        expression = expression.replaceAll("\\s+", "");

        Stack<Double> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            // If the character is a digit, parse the entire number and push it onto the
            // operand stack
            if (Character.isDigit(ch)) {
                StringBuilder sb = new StringBuilder();
                while (i < expression.length()
                        && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    sb.append(expression.charAt(i));
                    i++;
                }
                i--;
                double operand = Double.parseDouble(sb.toString());
                operandStack.push(operand);
            }
            // If the character is an operator, evaluate the higher precedence operators on
            // the operator stack and then push the current operator
            else if (isOperator(ch)) {
                while (!operatorStack.isEmpty() && hasHigherPrecedence(operatorStack.peek(), ch)) {
                    evaluateTopOperator(operandStack, operatorStack);
                }
                operatorStack.push(ch);
            }
        }

        // Evaluate any remaining operators on the operator stack
        while (!operatorStack.isEmpty()) {
            evaluateTopOperator(operandStack, operatorStack);
        }

        // The result will be the top element of the operand stack
        return operandStack.pop();
    }

    private boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    private boolean hasHigherPrecedence(char operator1, char operator2) {
        return (operator1 == '*' || operator1 == '/') && (operator2 == '+' || operator2 == '-');
    }

    private void evaluateTopOperator(Stack<Double> operandStack, Stack<Character> operatorStack) {
        double operand2 = operandStack.pop();
        double operand1 = operandStack.pop();
        char operator = operatorStack.pop();
        double result = performOperation(operand1, operand2, operator);
        operandStack.push(result);
    }

    private double performOperation(double operand1, double operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public static void main(String[] args) {
        MathExpressionParser parser = new MathExpressionParser("5 + 2 * 3 - 4 / 2");
        System.out.println(parser.evaluate());
    }
}
