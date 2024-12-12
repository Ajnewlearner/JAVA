public class IntReverse 
{
    static int reverse(int ...arr){
        int a;
        for (int i :arr) 
        {
            int b = i % 10;
            arr[i] = b;
            a = a / 10;
        }
        return 0;
    }
    public static void main(String[] args) 
    {
        int a = 123;
        int count ;
        for (int i = 2 ; i >= 0 ; i--) 
        {
            count = i;
            a = a/10;
        }
        int arr[] = new int[3];
        for (int i = 2 ; i >= 0 ; i--) 
        {
            int b = a % 10;
            arr[i] = b;
            a = a/10;
        }
        for(int i = 2; i >= 0 ; i--)
        {
            System.out.print(arr[i]);
        }
    }
}
