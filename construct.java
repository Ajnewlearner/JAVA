public class construct {
    private double radius;
    private construct(double radius){
        this.radius = radius;
    }
    public double setArea(){
        System.out.println(3.14*radius*radius);
        return 0;
    }
    public static void main(String[] args) {
        construct ar = new construct(3);
        ar.setArea();
    }
}
