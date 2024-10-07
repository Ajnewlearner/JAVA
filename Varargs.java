public class Varargs {
    // here ...arr is getting all no. in an array.
    // in this u can give 0 inputs still get an answer.
    static int sum(int ...arr){
        int sum  = 0;
        for(int i = 0; i < arr.length ; i++){
            sum += arr[i];
        }
        return sum;
    }
    // while in this u have to give atleast 1 inputs or it will throw an error
    static int bar(int a,int ...arr){
        int sum  = a;
        for(int i = 0; i < arr.length ; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        
        System.out.println("the sum of 4 and 5 is : " +bar(4,5));
        System.out.println("the sum of 4 and 5 is : " +sum(4,5));
        
    }
}
