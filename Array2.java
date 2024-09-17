import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the no. of elements in array ");
            // int[] ar = new int[4];
            // ar[0] = 34;
            // ar[2] = 23;
            // ar[1] = 34;
            // ar[3] = 25;
            
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n ; i++) {
                System.out.println("Enter the value "+i);
                arr[i] = sc.nextInt();
            }
            System.out.println("Displaying the array");
            for (int j:arr) {
                System.out.println(j);
            }
        }
    }
}
