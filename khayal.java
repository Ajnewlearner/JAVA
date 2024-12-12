
import java.util.Scanner;


// import javax.sound.sampled.SourceDataLine;

// class Reynolds
// {
//     String color;
//     String use;
//     public void show()
//     {
//         System.out.println("Color: " + color);
//         System.out.println("Use: " + use);
//     }
//     // abstract int Tota (int x, int t)
// }
abstract class parent{
    public parent(){
        System.out.println("i m the constructor");
    }
    public void internet(){
        System.out.println("a new one");
    }
    abstract public void greet(); 
    abstract public void age(int a); 
}
class children extends parent{
    @Override
    public void greet(){
        System.out.println("hii miss");
    }
    public void age(int a){
        System.out.println("your age is : "+a);
    }
}
abstract class shape{
    abstract public void radius();
    abstract public int lenghtWidth();
}
class circle extends shape{
    public void radius(){
        System.out.println("The radius is : ");
    }
}
public class khayal {
    public static void main(String[] args) {
        // Reynolds pen = new Reynolds();
        // pen.color = "White";
        // pen.use = "Writing";
        // pen.show();
        children names = new children();
        names.age = 60;
        names.greet = " hii Cute guy";
        shape circle = new shape(5);
    }  
}
