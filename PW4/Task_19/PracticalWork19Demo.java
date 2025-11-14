package PW4.Task_19;

public class PracticalWork19Demo {
    
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИЧЕСКАЯ РАБОТА №19: ПОЛЬЗОВАТЕЛЬСКИЕ ИСКЛЮЧЕНИЯ ===\n");
        
        System.out.println("Задание 1: Система онлайн-заказов с проверкой ИНН\n");
        
        // Тестирование различных сценариев
        testValidOrders();
        testInvalidOrders();
        testComprehensiveValidation();
        
        System.out.println("\n=== ДЕМОНСТРАЦИЯ ЗАВЕРШЕНА ===");
        System.out.println("Преимущества пользовательских исключений:");
        System.out.println("✅ Более понятные сообщения об ошибках");
        System.out.println("✅ Соответствие бизнес-логике приложения");
        System.out.println("✅ Возможность специфичной обработки разных ошибок");
        System.out.println("✅ Лучшая читаемость и поддерживаемость кода");
    }
    
    // Тестирование успешных заказов
    public static void testValidOrders() {
        System.out.println("--- ТЕСТИРОВАНИЕ УСПЕШНЫХ ЗАКАЗОВ ---");
        
        try {
            // Валидные ИНН (10 цифр)
            OnlineOrder order1 = new OnlineOrder("Иван Иванов", "1234567890");
            order1.processOrder();
            
            // Валидные ИНН (12 цифр)
            OnlineOrder order2 = new OnlineOrder("Петр Петров", "123456789012");
            order2.processOrder();
            
            System.out.println("✅ Все валидные заказы успешно обработаны!");
            
        } catch (InvalidINNException e) {
            System.out.println("❌ Неожиданная ошибка: " + e.getMessage());
        }
    }
    
    // Тестирование заказов с неверными ИНН
    public static void testInvalidOrders() {
        System.out.println("\n--- ТЕСТИРОВАНИЕ НЕВЕРНЫХ ИНН ---");
        
        String[] invalidINNs = {
            "123",              // Слишком короткий
            "123456789",        // 9 цифр
            "12345678901",      // 11 цифр
            "ABCDEFGHIJ",       // Буквы
            "12345 67890",      // С пробелом
            "12.34567890",      // С точкой
            null,               // Null
            ""                  // Пустая строка
        };
        
        for (String inn : invalidINNs) {
            try {
                OnlineOrder order = new OnlineOrder("Тестовый Клиент", inn);
                order.processOrder();
                System.out.println("✅ ИНН " + inn + " - ОЖИДАЛАСЬ ОШИБКА, но проверка прошла!");
            } catch (InvalidINNException e) {
                System.out.println("✅ ИНН " + inn + " - правильно отловлена ошибка: " + e.getMessage());
            }
        }
    }
    
    // Комплексное тестирование валидации
    public static void testComprehensiveValidation() {
        System.out.println("\n--- КОМПЛЕКСНОЕ ТЕСТИРОВАНИЕ ---");
        
        // Демонстрация работы в реальном сценарии
        System.out.println("Сценарий: Обработка нескольких заказов в системе");
        System.out.println();
        
        String[][] testCases = {
            {"Анна Сидорова", "9876543210", "VALID"},
            {"Борис Johnson", "INVALID123", "INVALID"},
            {"Мария Кузнецова", "111222333444", "VALID"},
            {"John Smith", "123", "INVALID"},
            {"Ольга Новикова", "555666777888", "VALID"}
        };
        
        int successfulOrders = 0;
        int failedOrders = 0;
        
        for (String[] testCase : testCases) {
            String customerName = testCase[0];
            String inn = testCase[1];
            String expectedResult = testCase[2];
            
            System.out.print("Обработка заказа для " + customerName + " (ИНН: " + inn + ")... ");
            
            try {
                OnlineOrder order = new OnlineOrder(customerName, inn);
                order.processOrder();
                successfulOrders++;
                System.out.println("✅ УСПЕХ");
                
            } catch (InvalidINNException e) {
                failedOrders++;
                System.out.println("❌ ОШИБКА: " + e.getMessage());
            }
        }
        
        System.out.println("\n--- ИТОГИ ОБРАБОТКИ ---");
        System.out.println("Успешных заказов: " + successfulOrders);
        System.out.println("Неудачных заказов: " + failedOrders);
        System.out.println("Общее количество: " + (successfulOrders + failedOrders));
    }
}