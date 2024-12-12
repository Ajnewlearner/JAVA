public class Reverse {
    public int reverse(int x) {
        int reversed = 0;
        
        // Loop until x becomes 0
        while (x != 0) {
            int lastDigit = x % 10;  // Extract the last digit
            reversed = reversed * 10 + lastDigit;  // Add the digit to the reversed number
            x = x / 10;  // Remove the last digit from x
        }
        
        return reversed;
    }

    public static void main(String[] args) {
        Reverse rev = new Reverse();  // Create an instance of the Reverse class
        
        int number = 234;  // Example input number
        int result = rev.reverse(number);  // Call the reverse method

        System.out.println("Reversed Number: " + result);  // Output the result
    }
}

