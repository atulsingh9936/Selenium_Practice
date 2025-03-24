package Core_java_2.static_variable;

public class static_variable {
    String name;  // Instance varaiables
    String address;
   static String city; // class variables
    static int i ;

    static{
        city= "bangalore";
        int i=0;
    }

    static_variable(String name, String address ){
        this.name = name;
        this.address= address;
        i++;
        System.out.println(i);


    }

    public void getaddress(){
        System.out.println(address+" "+city);
    }

    public static void getcity(){
        System.out.println(city);
    }





    public static void main(String[] args) {
        static_variable Obj = new static_variable("bob", "marathalli");
        static_variable Obj2 = new static_variable("ram", "jayanagar");
        static_variable Obj3 = new static_variable("ram", "jayanagar");
        Obj.getaddress();
        Obj2.getaddress();
        static_variable.getcity();
        static_variable.i=4;
        Obj.address="XYZ";




    }
}
