
import java.lang.reflect.Array;

public class Reverse {
    public int reverse(int x) {
        String str = Integer.toString(x); 
        for(int i = 0;i < str.length(); i++)
        {
            int n = x%10;
            x = x/10;
            int []arr = new int[n];
            String s = Arrays.toString(arr);
        }
        
    }
    public static void main(String[] args) {
        int x = 234;
    }
}
