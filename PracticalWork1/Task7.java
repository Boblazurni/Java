import java.util.Scanner;

class Task7{
    private static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int res = 1;
        for(int i = 1; i <= input; i++){
            res = res*i;
        }
        System.out.println(res);
    }
}