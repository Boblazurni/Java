import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
//ввод количества элементов
        System.out.println("input amount of array:");
        int length = scan.nextInt();
        System.out.println("input " + length + " numbers:");
        int[] arr = new int[length];
//ввод массива и подсчет суммы
        for (int i = 0; i < length; i++) arr[i] = scan.nextInt();
        for (int i = 0; i < length; i++) sum += arr[i];
        System.out.println(sum);
    }
}