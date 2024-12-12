
import java.util.Scanner;

interface client{
    void input();
    void output();
}
class teach implements client{
    String name;
    double age;
    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        name = sc.nextLine();
        System.out.println("Enter the salary");
        age = sc.nextDouble();
    }
    @Override
    public void output(){
        System.out.println(name+" \n"+age);
    }
}
interface cycle{
    int a = 10;
    int speedup();
    int slow();
}
class bmx implements cycle{
    int speed = 10;
    public void speedup(int a){
        speed = speed + a;
        System.out.println(speed);
    }
    public void slow(int a){
        speed -= a;
    }
    public void horn(){
        System.out.println("Blow");
    }
}
public class Interfaceless {
    public static void main(String[] args) {
    client c = new teach();
    c.input();
    c.output();
    cycle mine = new bmx();
    mine.a;
    }
}
