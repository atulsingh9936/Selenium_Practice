package Core_Java.Inheritance;

public class Functional_overloading extends  ChildclassDemo {
    // function overloading
    // either argument count should be different or  argument data type should be different

    public void getdata(int a){
        System.out.println(a);

    }

    public void getdata(int a, int b){
        System.out.println(a+" " +b);

    }
    public void getdata( String a){
        System.out.println(a);

    }

    public static void main(String[] args) {
        Functional_overloading f = new Functional_overloading();
        f.audiosystem();
        f.getdata(1);
        f.getdata(1,9);
        f.getdata("hello");
    }
}
