import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {
        int min = 1;
        int max = 1;
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length]; 
        int i = 0;

        while (i < length) {
            if(i == 1){
                max = arr[0];
                min = arr[0];
            }
            arr[i] = scanner.nextInt();
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) max = arr[i];
            i++;
        }
        System.out.println(max + min);
    }
}
