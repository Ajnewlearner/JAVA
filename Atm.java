
import java.util.Scanner;

class Atm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your respective pin : ");
        int pin = sc.nextInt();
        while (pin != 3124) {
            if(pin != 3124){
                System.out.println("Incorrect pin! try again");
                pin = sc.nextInt();
            }
            else{
                break;
            }
        }
        System.out.println("Pin accepted Thank you");
        sc.close();                                       
    }
}