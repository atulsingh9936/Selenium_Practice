package Core_java_2.Collection_Framework;

import java.util.ArrayList;

public class arraylistexample {
    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<String>();
        a.add("rahul");
        a.add("java");
        a.add("java");
        System.out.println(a);
        a.add(0,"student");
        System.out.println(a);
      //  a.remove(1);
        System.out.println(a);
       // a.remove("java");
        System.out.println(a);
        System.out.println(a.get(2));
        //testing
        System.out.println(a.contains("testing"));
        System.out.println(a.indexOf("rahul"));
        System.out.println( a.isEmpty());
        System.out.println(a.size());






    }
}
