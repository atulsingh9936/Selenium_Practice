package Core_java_BrushUp_1;

public class PS2 extends PS3 {
    int a;

    // default constructor
    public PS2(int a) {
        super(a); // parent class constructor is invoked
       this.a=a;
    }


    public int increment(){
        a=a+1;
        return a;

    }


    public int Decrement(){
        a=a-1;
        return a;

    }
}
