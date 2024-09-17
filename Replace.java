import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // taking anyname
            System.out.println("Enter the value u password");
            String st = sc.nextLine();
            //replacing spaces with underscore
            System.out.println(st.replace(" ","_"));
            //replacing name 
            String letter = "welcome to my codes name ";
            System.out.println(letter.replace("name",st));
            // seeing if two or three spaces are there in name
            System.out.println(st.indexOf("  "));
            System.out.println(st.indexOf("   "));
        }
    }    
}
