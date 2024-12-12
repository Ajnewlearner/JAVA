
// package assignment;
public class assesment {
    public static void main(String[] args) {
        try{
            @SuppressWarnings("unused")
            int a,b;b =0 ; a = 5 /b;
            System.out.println("A");
        }
        catch(ArithmeticException e)
        {
            System.out.println("b");
        }
        finally{
            System.out.println("C");
        }
    }
}
