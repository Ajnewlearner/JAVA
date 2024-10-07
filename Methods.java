public class Methods {
    int logic(int x,int y)
    {
        int sum;
        if (x<y) {
            sum = x+y;
        }
        else{
            sum = (x+y)*x;
        }
        return sum;
    }
    public static void main(String[] args) {
        Methods m = new Methods();
        // here we are using the new method as we didn't create static logic 
        System.out.println(m.logic(5,6));
        // or we can easily do it by creating a static logic 
        // System.out.println(logic(5,6));

    }

}
