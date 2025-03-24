package Core_java_2.Super_keyword;

public class Childdemo  extends ParentDemo{

    String name = "QA click academy";

    public Childdemo(){
        super(); // this should always be at first line
        System.out.println("child class constructor");
    }





    public void getStringgetdata(){
        System.out.println(name);
        System.out.println(super.name);
    }

    public void getdata(){
        super.getdata();
        System.out.println(" i am child class");
    }

    public static void main(String[] args) {

        Childdemo cd = new Childdemo();
        cd.getStringgetdata();
        cd.getdata();

    }
}
