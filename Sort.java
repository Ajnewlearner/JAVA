public class Sort {
    public static void main(String[] args) 
    {
        int arr [] = {21,22,23,24,27,56};
        boolean isSorted = true;
        for(int i = 0 ; i < arr.length-1 ; i++)
        {
            if (i == arr.length) {
                if (arr[i-1] < arr[i]) {
                    break;
                }
            }
            int s = arr[i+1];
            if(arr[i] < s){
                isSorted = true;
            }
            else{
                isSorted = false;
                System.out.println("not sorted, sorting in progress... retry for now");
                break;
            }
        }
        if (isSorted == true) {
            System.out.println("sorted one");
        } 
    }
}
