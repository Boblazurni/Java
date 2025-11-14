package PW4.Task_19;

public class OnlineOrder {
    private String customerName;
    private String inn;
    
    public OnlineOrder(String name, String inn) throws InvalidINNException {
        this.customerName = name;
        setInn(inn); // Валидация при создании
    }
    
    public void setInn(String inn) throws InvalidINNException {
        if (!isValidINN(inn)) {
            throw new InvalidINNException("Неверный формат ИНН: '" + inn + 
                "'. ИНН должен содержать 10 или 12 цифр.");
        }
        this.inn = inn;
    }
    
    private boolean isValidINN(String inn) {
        if (inn == null) return false;
        // Проверка: только цифры, длиной 10 или 12
        return inn.matches("\\d{10}|\\d{12}");
    }
    
    public void processOrder() {
        System.out.println("✓ Заказ успешно оформлен для: " + 
            customerName + ", ИНН: " + inn);
    }
    
    // Геттеры
    public String getCustomerName() { return customerName; }
    public String getInn() { return inn; }
}