
import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        System.out.println("Enter the number of element in array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        System.out.println("Enter the array elements");
        for (int j = 0 ; j < arr.length ; j++) {
            arr[j] = sc.nextInt();
        }
        int max = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(max < arr[i]){
                max = arr[i];
            }
        } 
        System.out.println(max);
        // make a code for minimum too
    }
}
