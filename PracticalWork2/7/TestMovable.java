// Файл для дополнительного тестирования Заданий 1-3
public class TestMovable {
    public static void main(String[] args) {
        System.out.println("=== ТЕСТИРОВАНИЕ MOVABLE ===");
        
        // Тестирование MovablePoint
        MovablePoint point = new MovablePoint(10, 20, 3, 2);
        System.out.println("Исходная точка: " + point);
        
        point.moveUp();
        point.moveRight();
        System.out.println("После движения вверх и вправо: " + point);
        
        // Тестирование MovableRectangle
        MovableRectangle rectangle = new MovableRectangle(0, 0, 8, 6, 2, 1);
        System.out.println("\nИсходный прямоугольник: " + rectangle);
        
        rectangle.moveLeft();
        rectangle.moveDown();
        System.out.println("После движения влево и вниз: " + rectangle);
        
        // Тестирование разных скоростей (должно быть false)
        MovableRectangle badRectangle = new MovableRectangle(0, 0, 5, 5, 2, 1);
        System.out.println("\nПрямоугольник с разными скоростями точек: " + badRectangle);
        System.out.println("Проверка скорости: " + badRectangle.speedTest());
    }
}