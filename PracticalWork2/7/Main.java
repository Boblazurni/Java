// Файл для Заданий 1-9: Основной класс с демонстрацией всех заданий
public class Main {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИЧЕСКАЯ РАБОТА №7 - ДЕМОНСТРАЦИЯ ВСЕХ ЗАДАНИЙ ===\n");
        
        // Демонстрация Заданий 1-3: Movable
        demonstrateMovable();
        
        // Демонстрация Задания 4: MathCalculable
        demonstrateMathCalculable();
        
        // Демонстрация Заданий 5-6: StringProcessor
        demonstrateStringProcessor();
        
        // Демонстрация Заданий 7-8: Printable
        demonstratePrintable();
        
        System.out.println("\n=== ВСЕ ЗАДАНИЯ ВЫПОЛНЕНЫ ===");
    }
    
    // Демонстрация Заданий 1-3
    private static void demonstrateMovable() {
        System.out.println("=== ЗАДАНИЯ 1-3: MOVABLE RECTANGLE ===");
        
        MovableRectangle rect = new MovableRectangle(0, 0, 5, 3, 2, 1);
        System.out.println("Исходное состояние: " + rect);
        
        rect.moveRight();
        rect.moveDown();
        System.out.println("После движения вправо и вниз: " + rect);
        
        System.out.println("Проверка скорости точек: " + rect.speedTest());
    }
    
    // Демонстрация Задания 4
    private static void demonstrateMathCalculable() {
        System.out.println("\n=== ЗАДАНИЕ 4: MATH CALCULABLE ===");
        
        MathCalculable math = new MathFunc();
        System.out.println("2^3 = " + math.power(2, 3));
        System.out.println("2^(-3) = " + math.power(2, -3));
        System.out.println("Модуль комплексного числа 3+4i = " + math.complexModulus(3, 4));
        System.out.println("Длина окружности радиуса 5 = " + ((MathFunc)math).circleLength(5));
        System.out.println("Площадь круга радиуса 5 = " + ((MathFunc)math).circleArea(5));
        System.out.println("Число PI из интерфейса: " + MathCalculable.PI);
    }
    
    // Демонстрация Заданий 5-6
    private static void demonstrateStringProcessor() {
        System.out.println("\n=== ЗАДАНИЯ 5-6: STRING PROCESSOR ===");
        
        StringProcessor processor = new ProcessStrings();
        String testString = "Hello World!";
        
        System.out.println("Исходная строка: " + testString);
        System.out.println("Количество символов: " + processor.countCharacters(testString));
        System.out.println("Символы на нечетных позициях: " + processor.oddPositionCharacters(testString));
        System.out.println("Инвертированная строка: " + processor.reverseString(testString));
    }
    
    // Демонстрация Заданий 7-8
    private static void demonstratePrintable() {
        System.out.println("\n=== ЗАДАНИЯ 7-8: PRINTABLE ===");
        
        Printable[] items = {
            new Book("Война и мир", "Л. Н. Толстой", 1863),
            new Journal("Хакер"),
            new Book("Отцы и дети", "И. Тургенев", 1862),
            new Journal("Наука и жизнь"),
            new Book("Преступление и наказание", "Ф. Достоевский", 1866)
        };
        
        System.out.println("Все элементы:");
        for (Printable item : items) {
            item.print();
        }
        
        System.out.println("\nТолько книги (статический метод):");
        Book.printBooks(items);
        
        System.out.println("\nТолько журналы (статический метод):");
        Journal.printMagazines(items);
        
        // Демонстрация полиморфизма
        System.out.println("\nДемонстрация полиморфизма:");
        Printable printable = new Book("Мастер и Маргарита", "М. Булгаков", 1967);
        printable.print();
        
        printable = new Journal("Компьютерра");
        printable.print();
    }
}