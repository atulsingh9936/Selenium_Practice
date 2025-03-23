package Core_Java.Abstract_class;

public abstract class ParentAirCraft {
    public void engine(){
        System.out.println("follow engine");  // non abstract, non concrete
    }

    public void safetyguidelines(){
        System.out.println("follow safety guidelines");
    }

    public abstract void bodycolor();
}
