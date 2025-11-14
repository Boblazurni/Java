package PW4.Task_18;

import java.util.Scanner;

public class ThrowsDemo4 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        boolean validInput = false;
        
        while (!validInput) {
            try {
                System.out.print("Enter key: ");
                String key = myScanner.next();
                printDetails(key);
                validInput = true; // Успех - выходим из цикла
                myScanner.close();
            } catch (Exception e) {
                System.out.println("Invalid input: " + e.getMessage());
                System.out.println("Please try again.");
            }
        }
        
    }
    
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }
    
    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key cannot be empty");
        }
        return "data for " + key;
    }
}