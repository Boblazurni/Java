package PW4.Task_18; 

import java.util.Scanner;

public class Exception3 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = myScanner.next();
        
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
            myScanner.close();
        } catch (NumberFormatException e) { // ЭТОТ БЛОК НИКОГДА НЕ ВЫПОЛНИТСЯ!
            System.out.println("Number format error");
        } catch (ArithmeticException e) { // И ЭТОТ ТОЖЕ!
            System.out.println("Division by zero");
        } catch (Exception e) { // ОБЩИЙ исключение ПЕРВЫМ - НЕПРАВИЛЬНО!
            System.out.println("General exception: " + e.getMessage());
        }
    }
}
