import java.util.Scanner;
public class Assos {
    public static void main(String[] args) {
        System.out.println("Enter the name ");
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.next();
            System.out.println(name.toUpperCase());
        }
        String newName = "ayushshsh ";
        System.out.println(newName.trim());
        System.out.println(newName.lastIndexOf("sh",4));
    }    
}
