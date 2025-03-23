package Core_Java.Inheritance;

public class ChildclassDemo extends ParentClassDemo {
    public void engine(){
        System.out.println("new engine");
    }
    public void audiosystem(){
        System.out.println(" new audiosystem code child system is implemented");
    }

    public void colour(){
        System.out.println(colour);
    }
    public static void main(String[] args) {
        ChildclassDemo childclassDemo = new ChildclassDemo();
        childclassDemo.colour();
        childclassDemo.brakes();
        childclassDemo.audiosystem();

    }
}
