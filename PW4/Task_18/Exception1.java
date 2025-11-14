package PW4.Task_18; 

public class Exception1 {
    // Шаг 1: Исходный код - деление на ноль
    public void exceptionDemo() {
        System.out.println(2 / 0); // ArithmeticException: / by zero
    }
    
    // Шаг 2: Деление double на double
    public void exceptionDemoDouble() {
        System.out.println(2.0 / 0.0); // Результат: Infinity (не исключение!)
    }
    
    // Шаг 3: Обработка исключения
    public void exceptionDemoWithTryCatch() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }
}