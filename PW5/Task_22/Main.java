package PW5.Task_22;

public class Main {
    public static void main(String[] args) {
        RPNCalculator model = new RPNCalculator();
        RPNView view = new RPNView();
        new RPNController(model, view);
    }
}