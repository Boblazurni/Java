import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {
        int min = 1, max = 1, sum = 0;
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length]; 
        int i = 0;

        while (i < length) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
            if (i == 0) { max = arr[0]; min = arr[0]; }
            max = (arr[i] > max) ? arr[i] : max; //short if
            min = (arr[i] < min) ? arr[i] : min;
            i++;
        }
        System.out.println("Sum: " + sum + ", Max: " + max + ", Min: " + min);
    }
}
