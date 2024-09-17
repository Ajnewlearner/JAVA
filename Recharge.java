
import java.util.Scanner;

public class Recharge {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your current balance : ");
            int balance = sc.nextInt();
            if (balance >= 500){
                System.out.println("The recharge of Rs500 will be perfect for you : ");
                System.out.printf("Remaing balance Rs%d",balance-500);
            }
            else if (balance < 500 && balance >= 299){
                System.out.println("Rs299 recharge will be most suitable for you");
                System.out.printf("Remaining balance Rs%d",balance-299);
            }
            else{
                System.out.println("Sorry sir/ma'am you have insufficient balance");
                int rem = 299 - balance;
                System.out.println(rem);
            }
        }
    }
}
