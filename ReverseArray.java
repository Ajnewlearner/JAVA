
import java.util.Scanner;

public class ReverseArray {
    // public static void swap(int a,int b){
    //     int t = a;
    //     a = b;
    //     b = t;
    // }
    public static void main(String[] args) {
        // reversing the array  
        // trial 1 mine
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array u want : ");
        int x = sc.nextInt();
        int arr[]  = new int[x];
        for (int j = 0 ;j < x ; j++) {
            arr[j] = sc.nextInt();
        }
        int brr[]  = new int[arr.length];
        for (int i = 0; i < arr.length ; i++){
            int n = arr.length - 1 - i;
            brr[i] = arr[n] ;
        }
        for (int i = 0; i < brr.length ; i++) {
            System.out.print(brr[i]);            
            System.out.print(" ");            
        }

        // trial 2
        
        // int arr[]  = {23,32,434,53,24};
        // int mid = arr.length/2;
        // int x = 4,y =5;
        // swap(x,y);
        // System.out.println(x+" "+y);
        

    }
}
