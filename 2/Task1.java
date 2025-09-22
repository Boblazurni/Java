import java.util.Scanner;

public class Task1{
    Scanner scan = new Scanner(System.in);
    String name = scan.next();
    String email = scan.next();
    char gender = scan.next().charAt(0);
    Author a = new Author(name, email, gender);

    public static void main(String[] args, Author a){
        System.out.println();
    }
}