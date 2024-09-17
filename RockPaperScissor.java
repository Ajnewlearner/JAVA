import java.util.Random;
import java.util.Scanner;
// import java.util.random.*;
// import java.util.stream.IntStream;
public class RockPaperScissor {
    public static void main(String[] args) {
                Random ra = new Random();
                int b = ra.nextInt(1,4);
                try (Scanner sc = new Scanner(System.in)) {
                    System.out.println(b);
                    System.out.println("Enter your no. for \n1 rock \n2 paper \n3 sissors \n 4 to quit");
                    int a = sc.nextInt(5);
                    if (a == b) {
                        System.out.println("Tie");
                    }
                    else if (a == 1 && b == 2) {
                        System.out.println("System won");
                    }
                    else if (a == 1 && b == 3) {
                        System.out.println("u won");
                    }
                    else if (a == 2 && b == 3) {
                        System.out.println("Systemmmmmmmmm won");
                    }
                    else if (a == 2 && b == 1) {
                        System.out.println("u won");
                    }
                    else if (a == 3 && b == 1) {
                        System.out.println("System won");
                    }
                    else if (a == 3 && b == 2){
                        System.out.println("U won");
                    }
                }
        }   
    // public void nextBytes(byte[] bytes) {
    //     for (int i = 0; i < bytes.length; )
    //       for (int rnd = nextInt(), n = Math.min(bytes.length - i, 4);
    //            n-- > 0; rnd >>= 8)
    //         bytes[i++] = (byte)rnd;
    //   }
}
