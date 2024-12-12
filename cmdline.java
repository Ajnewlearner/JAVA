public class cmdline {
    public static void main(String  args[]) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        String ste = args[0];
        String str = args[1];

        int x = Integer.parseInt(str);
        int y = Integer.parseInt(ste); 
        System.out.println(x+y);


    }
}
