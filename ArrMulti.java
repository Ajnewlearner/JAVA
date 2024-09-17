
import java.util.Scanner;

public class ArrMulti {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        // taking input for rows and columns
        System.out.println("Enter the value of rows and columns respectively : ");
        int  a = sc.nextInt();
        int  b = sc.nextInt();
        int i,j;
        int [][]arr = new int[a][b];
        // arr[0][0] = 1;
        // arr[0][1] = 2;
        // arr[0][2] = 3;
        // arr[1][0] = 4;
        // arr[1][1] = 5;
        // arr[1][2] = 6;


        // inputs of values
        System.out.println("Enter the value of matrixs as follows : ");
        for ( i = 0 ; i < a ; i++) 
        {
            for (j = 0 ; j < b ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        // displaying array
        for ( i = 0 ; i < arr.length ; i++) 
        {
            for ( j = 0 ; j < arr[i].length ; j++) 
            {
                // arr = new int[i][j];
                System.out.print(arr[i][j]+"");
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
