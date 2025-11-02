// Файл для дополнительного тестирования Заданий 5-6
public class TestStrings {
    public static void main(String[] args) {
        System.out.println("=== ТЕСТИРОВАНИЕ STRING PROCESSOR ===");
        
        ProcessStrings processor = new ProcessStrings();
        
        String[] testStrings = {
            "Hello",
            "Java Programming",
            "Test",
            "ABCDEFGH",
            ""
        };
        
        for (String str : testStrings) {
            System.out.println("\nИсходная строка: '" + str + "'");
            System.out.println("Длина: " + processor.countCharacters(str));
            System.out.println("Нечетные позиции: '" + processor.oddPositionCharacters(str) + "'");
            System.out.println("Реверс: '" + processor.reverseString(str) + "'");
        }
    }
}