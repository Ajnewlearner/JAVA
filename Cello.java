abstract class Reynolds
{
    String color;
    String use;
    public void show()
    {
        System.out.println("Color: " + color);
        System.out.println("Use: " + use);
    }
    abstract int Tota (int x, int t)
}
public class Cello {
    public static void main(String[] args) {
        Reynolds pen = new Reynolds();
        pen.color = "White";
        pen.use = "Writing";
        pen.show();
    } 
}

