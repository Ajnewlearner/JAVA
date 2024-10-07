public class IntReverse 
{
    public static void main(String[] args) 
    {
        int a = 123;
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
