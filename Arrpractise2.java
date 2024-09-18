public class Arrpractise2 {
    public static void main(String[] args) {
        int arr[]  = {23,32,434,53,24};
        int brr[]  = new int[4];
        for (int i = 0; i < arr.length ; i++){
            int n = 5 - i;
            arr[n] = brr[i];
            System.out.println("yup");
        }
        for (int i = 0; i < brr.length ; i++) {
            System.out.println(brr[i]);            
        }
    }
}
