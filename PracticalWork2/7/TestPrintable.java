// Файл для дополнительного тестирования Заданий 7-8
public class TestPrintable {
    public static void main(String[] args) {
        System.out.println("=== ТЕСТИРОВАНИЕ PRINTABLE ===");
        
        // Создание массива Printable объектов
        Printable[] items = {
            new Book("1984", "Дж. Оруэлл", 1949),
            new Journal("Forbes"),
            new Book("Маленький принц", "А. де Сент-Экзюпери", 1943),
            new Journal("National Geographic"),
            new Book("Гарри Поттер", "Дж. К. Роулинг", 1997)
        };
        
        // Тестирование статических методов
        System.out.println("--- ВСЕ КНИГИ ---");
        Book.printBooks(items);
        
        System.out.println("\n--- ВСЕ ЖУРНАЛЫ ---");
        Journal.printMagazines(items);
        
        // Тестирование instanceof
        System.out.println("\n--- ПРОВЕРКА TYPES ---");
        for (Printable item : items) {
            if (item instanceof Book) {
                System.out.println("Это книга: " + ((Book)item).getName());
            } else if (item instanceof Journal) {
                System.out.println("Это журнал: " + ((Journal)item).getName());
            }
        }
    }
}