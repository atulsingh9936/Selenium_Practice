package Core_java_2;

public class Constructor {
    // Default constructor
    public Constructor(){
        System.out.println(" i am in the constructor");
        System.out.println(" i am in the constructor lecture 1");

    }
    // Parameterized constructor
    public  Constructor(int a, int b ){
        System.out.println("I am in the parametrized constructor");
        int c = a+b;
        System.out.println(c);
    }

    public  Constructor(String str ){
        System.out.println(str);
    }



    // normal method
    public void getdata(){
        System.out.println(" i am the method");
    }

    public static void main(String[] args) {

        Constructor constructor = new Constructor();
         Constructor constructor1 = new Constructor("Hello");
       Constructor constructor2 = new Constructor(4,5);


    }
}
