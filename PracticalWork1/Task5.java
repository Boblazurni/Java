import java.util.Scanner;

class Task5{
    private static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] s = new int[10];
        
        for(int i = 0; i < 10; i++){
            System.out.print("Input " + i + ": ");
            s[i] = scanner.nextInt();
        }
        
        System.out.println("-----")
        
        for(int i = 0; i < 10; i++){
            System.out.println(i + ": " + s[i]);
        }
    }
}