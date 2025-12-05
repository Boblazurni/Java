package PW5.Task_22;

import java.util.Stack;

public class RPNCalculator {
    private Stack<Double> stack = new Stack<>();

    public void push(double value) {
        stack.push(value);
    }

    public double pop() {
        if (stack.isEmpty()) throw new IllegalStateException("Stack empty");
        return stack.pop();
    }

    public void performOperation(String op) {
        if (stack.size() < 2) throw new IllegalStateException("Not enough operands");
        double b = pop();
        double a = pop();
        switch (op) {
            case "+": push(a + b); break;
            case "-": push(a - b); break;
            case "*": push(a * b); break;
            case "/": 
                if (b == 0) throw new ArithmeticException("Division by zero");
                push(a / b); break;
            default: throw new IllegalArgumentException("Unknown operator");
        }
    }

    public double getResult() {
        return stack.isEmpty() ? 0 : stack.peek();
    }

    public void clear() {
        stack.clear();
    }
}