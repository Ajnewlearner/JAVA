import java.util.Random;
import java.util.Scanner;

public class Rock2 
{
    public static void main(String[] args) 
    {
        char i = 'y'; 
        while (i == 'y')
        {    
            try (Scanner scan = new Scanner(System.in)) {
                System.out.println("Wanna play ?? y/n");
                i = scan.next().charAt(0);
            }
            if (i == 'y') {    
                Random ra = new Random();
                int b = ra.nextInt(1,4);
                try (Scanner sc = new Scanner(System.in)) {
                    System.out.println(b);
                    System.out.println("Enter your no. for \n1 rock \n2 paper \n3 sissors \n 4 to quit");
                    int a = sc.nextInt(5);
                    if (a == b) {
                        System.out.println("Tie");
                    }
                    else if (a == 1 && b == 2) {
                        System.out.println("Systemmmmmmmmm won");
                    }
                    else if (a == 1 && b == 3) {
                        System.out.println("u won");
                    }
                    else if (a == 2 && b == 3) {
                        System.out.println("Systemmmmmmmmm won");
                    }
                    else if (a == 2 && b == 1) {
                        System.out.println("u won");
                    }
                    else if (a == 3 && b == 1) {
                        System.out.println("Systemmmmmmmmm won");
                    }
                    else if (a == 3 && b == 2){
                        System.out.println("U won");
                    }
                }
            }
            else{
                break;
            }
        }
    }
}
