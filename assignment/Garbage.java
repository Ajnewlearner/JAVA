
public class Garbage {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Garbage obj1 = new Garbage();
        obj1 = null;
        System.gc();
        System.out.println("Garbage collection request");
    }    
}
