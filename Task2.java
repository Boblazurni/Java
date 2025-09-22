import java.util.Scanner;

class Author{
    Scanner scan = new Scanner(System.in);
    String name, email = "";
    char gender = ' ';
    public Author(){
        name = scan.next();
        email = scan.next();
        String ch = scan.next();
        gender = ch.charAt(0);

        this.name = name;
        this.email = email;
        this.gender = gender;
    }
}

public class Task2 {
    Author a = new Author();
    public static void main(String[] args, Author a){
        System.out.println(a.name);
    }
}
