package Core_Java.Abstract_class;

public class childemirates  extends ParentAirCraft{
    public static void main(String[] args) {
        childemirates childemirates= new childemirates();
        childemirates.bodycolor();
        childemirates.safetyguidelines();
        childemirates.engine();

    }

    @Override
    public void bodycolor() {
        System.out.println("red color on the body");
    }
}
