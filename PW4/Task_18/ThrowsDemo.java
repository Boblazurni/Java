package PW4.Task_18; 

public class ThrowsDemo {
    public void getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        System.out.println("Key details: " + key);
    }
    
    // Шаг 2: Обработка внутри метода
    public void getDetailsWithTryCatch(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            System.out.println("Key details: " + key);
        } catch (NullPointerException e) {
            System.out.println("Caught exception: " + e.getMessage());
            // Здесь можно выполнить восстановительные действия
        }
    }
}