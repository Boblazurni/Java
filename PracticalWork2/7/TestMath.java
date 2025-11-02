// Файл для дополнительного тестирования Задания 4
public class TestMath {
    public static void main(String[] args) {
        System.out.println("=== ТЕСТИРОВАНИЕ MATH FUNCTIONS ===");
        
        MathFunc math = new MathFunc();
        
        // Тестирование возведения в степень
        System.out.println("5^4 = " + math.power(5, 4));
        System.out.println("3^(-2) = " + math.power(3, -2));
        System.out.println("10^0 = " + math.power(10, 0));
        
        // Тестирование модуля комплексного числа
        System.out.println("|3 + 4i| = " + math.complexModulus(3, 4));
        System.out.println("|5 + 12i| = " + math.complexModulus(5, 12));
        System.out.println("|1 + i| = " + math.complexModulus(1, 1));
        
        // Тестирование геометрических функций
        System.out.println("Длина окружности радиуса 1: " + math.circleLength(1));
        System.out.println("Площадь круга радиуса 2: " + math.circleArea(2));
        
        // Демонстрация использования константы PI
        System.out.println("PI = " + MathCalculable.PI);
    }
}