public class arrt {
    public static void main(String[] args) 
    {
        int arr [] = {21,22,23,24,2,56};
        boolean isSorted = true;
        for(int i = 0 ; i < arr.length-1 ; i++)
        {
            int s = arr[i+1];
            if (s > arr[i]) {
                isSorted = true;
            }
            else{
                isSorted = false;
                break;
            }
            System.out.println(arr[i]);
        }
        if (isSorted == false) {
            System.out.println("nope");
        }
    }
}
