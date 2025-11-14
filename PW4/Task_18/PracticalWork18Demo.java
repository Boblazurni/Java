package PW4.Task_18; 

public class PracticalWork18Demo {
    
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИЧЕСКАЯ РАБОТА №18: ИСКЛЮЧЕНИЯ ===\n");
        
        // Задание 1: Базовая обработка исключений
        demonstrateTask1();
        
        // Задание 2-4: Обработка пользовательского ввода
        demonstrateTask2_4();
        
        // Задание 5-6: Генерация и проброс исключений
        demonstrateTask5_6();
        
        // Задание 7-8: Улучшенная обработка с циклами
        demonstrateTask7_8();
        
        System.out.println("\n=== ДЕМОНСТРАЦИЯ ЗАВЕРШЕНА ===");
    }
    
    public static void demonstrateTask1() {
        System.out.println("--- ЗАДАНИЕ 1: Базовая обработка исключений ---");
        
        Exception1 demo = new Exception1();
        
        System.out.println("1. Деление на ноль (без обработки):");
        // demo.exceptionDemo(); // Раскомментируйте чтобы увидеть исключение
        
        System.out.println("2. Деление double на ноль:");
        demo.exceptionDemoDouble();
        
        System.out.println("3. Деление на ноль с обработкой:");
        demo.exceptionDemoWithTryCatch();
        
        System.out.println();
    }
    
    public static void demonstrateTask2_4() {
        System.out.println("--- ЗАДАНИЯ 2-4: Обработка пользовательского ввода ---");
        
        Exception2 demo = new Exception2();
        
        System.out.println("Демонстрация класса Exception2:");
        System.out.println("Этот класс содержит интерактивный ввод.");
        System.out.println("Для тестирования раскомментируйте вызов demo.exceptionDemo() в коде.");
        // demo.exceptionDemo(); // Раскомментируйте для интерактивного тестирования
        
        System.out.println();
    }
    
    public static void demonstrateTask5_6() {
        System.out.println("--- ЗАДАНИЯ 5-6: Генерация и проброс исключений ---");
        
        ThrowsDemo demo = new ThrowsDemo();
        ThrowsDemo2 demo2 = new ThrowsDemo2();
        
        System.out.println("1. Генерация NullPointerException:");
        // demo.getDetails(null); // Раскомментируйте чтобы увидеть исключение
        
        System.out.println("2. Обработка внутри метода:");
        demo.getDetailsWithTryCatch(null);
        demo.getDetailsWithTryCatch("validKey");
        
        System.out.println("3. Цепочка вызовов с обработкой:");
        demo2.printMessage(null);
        demo2.printMessage("workingKey");
        
        System.out.println();
    }
    
    public static void demonstrateTask7_8() {
        System.out.println("--- ЗАДАНИЯ 7-8: Улучшенная обработка с циклами ---");
        
        ThrowsDemo3 demo3 = new ThrowsDemo3();
        ThrowsDemo4 demo4 = new ThrowsDemo4();
        
        System.out.println("1. Метод с объявлением throws:");
        System.out.println("ThrowsDemo3 требует обработки исключений при вызове getKey()");
        
        System.out.println("2. Улучшенная версия с циклом:");
        System.out.println("ThrowsDemo4 предоставляет повторные попытки ввода");
        // demo4.getKey(); // Раскомментируйте для интерактивного тестирования
        
        System.out.println("\nКлючевые выводы:");
        System.out.println("- try-catch защищает программу от падения");
        System.out.println("- finally гарантирует выполнение cleanup кода");
        System.out.println("- Правильный порядок catch важен для специфичных исключений");
        System.out.println("- Исключения можно генерировать и пробрасывать между методами");
    }
}