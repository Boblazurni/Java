package PW4.Task_18;

import java.util.Scanner;

public class ThrowsDemo3 {
    // Должен объявить throws, так как исключение не обрабатывается
    public void getKey() throws Exception {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        printDetails(key);
    }
    
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }
    
    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
            
        }
        return "data for " + key;
    }
}