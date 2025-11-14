package PW4.Task_18; 

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = myScanner.next();
        
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
            myScanner.close();
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format! Please enter integers only.");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed!");
        }
    }
}