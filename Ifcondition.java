import java.util.Scanner;
public class Ifcondition {
    public static void main(String[] args) {
        System.out.println("Enter the no.");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a>b) {
                // System.out.println("very great no.");
                if (a>c) {
                    System.out.println("a is greatest");
                }
                else{
                    System.out.println("");
                } 
            }
            else if (b>c) {
                System.out.println("smaller");
            }
            else{
                System.out.println("nope");
            }
        }
    }
}
