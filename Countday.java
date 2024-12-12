public class Countday {
    public static void main(String[] args) {
        // int date = 8;
        String day[] = {"tuesday","wednesday","thursday","friday","saturday","sunday"};
        int a = 8;
        for (int j = 0 ; j < 32 ; j++) {
            if (j == 8) {
                System.out.println("");
            }
        }
        for(int i = 0; i < 7 ; i++)
        {
            System.out.println("Today is "+day[i]);
        }
    }
}