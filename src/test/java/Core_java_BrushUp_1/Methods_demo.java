package Core_java_BrushUp_1;

public class Methods_demo {
    public static void main(String[] args) {
        Methods_demo d = new Methods_demo();
     String name=   d.getdata();
        System.out.println(name);
        Methods_demo_2 demo2= new Methods_demo_2();
        demo2.getUserdata();

        getdata2();


    }


    public String getdata(){
        System.out.println("hello world");
        return "rahul shetty";

    }

    public static String getdata2(){
        System.out.println("hello world");
        return "rahul shetty";

    }

}
