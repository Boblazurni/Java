package PW4.Task_20;

public class PracticalWork20Demo {
    
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИЧЕСКАЯ РАБОТА №20: ДЖЕНЕРИКИ ===\n");
        
        // Задания 1-3: Обобщенный класс Triple
        demonstrateTripleClass();
        
        // Задание 4: MinMax и Calculator
        demonstrateMinMaxAndCalculator();
        
        System.out.println("\n=== ДЕМОНСТРАЦИЯ ЗАВЕРШЕНА ===");
        System.out.println("Преимущества дженериков:");
        System.out.println("✅ Типобезопасность на этапе компиляции");
        System.out.println("✅ Исключение ClassCastException во время выполнения");
        System.out.println("✅ Повторное использование кода для разных типов");
        System.out.println("✅ Улучшенная читаемость и поддерживаемость");
    }
    
    // ===== ЗАДАНИЯ 1-3: КЛАСС TRIPLE =====
    public static void demonstrateTripleClass() {
        System.out.println("--- ЗАДАНИЯ 1-3: ОБОБЩЕННЫЙ КЛАСС TRIPLE ---\n");
        
        System.out.println("1. Создание Triple с разными типами:");
        
        // Triple с String, Dog и Integer
        Triple<String, Dog, Integer> triple1 = 
            new Triple<>("Hello World", new Dog("Бобик", 3, "Овчарка"), 42);
        
        System.out.println("Triple 1: " + triple1);
        triple1.printClassNames();
        System.out.println("Сравнение: 'Hello World' > 'ABC' = " + 
            triple1.isFirstGreaterThan("ABC"));
        
        // Triple с Integer, Animal и Double
        Triple<Integer, Animal, Double> triple2 = 
            new Triple<>(100, new Animal("Кот Мурзик", 2), 3.14159);
        
        System.out.println("\nTriple 2: " + triple2);
        triple2.printClassNames();
        System.out.println("Сравнение: 100 > 50 = " + triple2.isFirstGreaterThan(50));
        
        // Демонстрация работы сеттеров
        System.out.println("\n2. Демонстрация изменения значений:");
        triple1.setFirst("Новое значение");
        triple1.setThird(999);
        System.out.println("После изменений: " + triple1);
        
        demonstrateTripleConstraints();
    }
    
    public static void demonstrateTripleConstraints() {
        System.out.println("\n3. Демонстрация ограничений типов:");
        
        System.out.println("✅ Корректные использования (скомпилируются):");
        System.out.println("   - Triple<String, Dog, Boolean>");
        System.out.println("   - Triple<Integer, Animal, String>");
        System.out.println("   - Triple<Double, Dog, Character>");
        
        System.out.println("\n❌ Некорректные использования (НЕ скомпилируются):");
        System.out.println("   - Triple<Object, Dog, Integer>  // Object не Comparable");
        System.out.println("   - Triple<String, String, Integer> // String не Animal");
        System.out.println("   - Triple<Integer, Object, Boolean> // Object не Animal");
    }
    
    // ===== ЗАДАНИЕ 4: MINMAX И CALCULATOR =====
    public static void demonstrateMinMaxAndCalculator() {
        System.out.println("\n--- ЗАДАНИЕ 4: MINMAX И CALCULATOR ---\n");
        
        demonstrateMinMax();
        demonstrateCalculator();
    }
    
    public static void demonstrateMinMax() {
        System.out.println("1. КЛАСС MINMAX - поиск min/max в массивах:\n");
        
        // Тестирование с целыми числами
        Integer[] intArray = {5, 2, 8, 1, 9, -3, 7, 0, 4};
        MinMax<Integer> intMinMax = new MinMax<>(intArray);
        intMinMax.printArray();
        System.out.println("Min: " + intMinMax.findMin());
        System.out.println("Max: " + intMinMax.findMax());
        
        // Тестирование со строками
        String[] strArray = {"яблоко", "банан", "вишня", "арбуз", "дыня"};
        MinMax<String> strMinMax = new MinMax<>(strArray);
        strMinMax.printArray();
        System.out.println("Min (лексикографически): " + strMinMax.findMin());
        System.out.println("Max (лексикографически): " + strMinMax.findMax());
        
        // Тестирование с дробными числами
        Double[] doubleArray = {3.14, 2.71, 1.41, 0.0, -1.0, 5.55};
        MinMax<Double> doubleMinMax = new MinMax<>(doubleArray);
        doubleMinMax.printArray();
        System.out.println("Min: " + doubleMinMax.findMin());
        System.out.println("Max: " + doubleMinMax.findMax());
    }
    
    public static void demonstrateCalculator() {
        System.out.println("\n2. КЛАСС CALCULATOR - обобщенные математические операции:\n");
        
        System.out.println("--- Операции с разными типами чисел ---");
        
        // Разнообразные комбинации типов
        System.out.printf("Сумма (Integer + Double): %d + %.1f = %.2f\n", 5, 3.5, Calculator.sum(5, 3.5));
        System.out.printf("Умножение (Float + Long): %.1f * %d = %.2f\n", 2.5f, 4L, Calculator.multiply(2.5f, 4L));
        System.out.printf("Деление (Double + Integer): %.1f / %d = %.2f\n", 10.0, 2, Calculator.divide(10.0, 2));
        System.out.printf("Вычитание (Integer + Float): %d - %.1f = %.2f\n", 8, 3.2f, Calculator.subtraction(8, 3.2f));
        
        System.out.println("\n--- Тестирование граничных случаев ---");
        
        // Деление на ноль
        try {
            System.out.printf("Деление на ноль: %d / %d = ", 5, 0);
            System.out.println(Calculator.divide(5, 0));
        } catch (ArithmeticException e) {
            System.out.println("ОШИБКА: " + e.getMessage());
        }
        
        // Большие числа
        System.out.printf("Большие числа: %d + %d = %.0f\n", 
            Integer.MAX_VALUE, 1, Calculator.sum(Integer.MAX_VALUE, 1));
            
        // Смешанные типы
        System.out.printf("Смешанные типы: %.2f * %d = %.2f\n", 
            2.99, 100, Calculator.multiply(2.99, 100));
    }
}