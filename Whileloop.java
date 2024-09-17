
import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {
        // int i ='y';
        char i ='y';
        while (i =='y') {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("wanna play y/n");
                i = sc.next().charAt(0);
            }    
            if (i =='y') {
                System.out.println("yeah");
            }
            else{
                break;
            }
        }
    }
}
