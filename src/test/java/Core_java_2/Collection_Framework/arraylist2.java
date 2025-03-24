package Core_java_2.Collection_Framework;

import java.util.ArrayList;

public class arraylist2 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
                a.add("apple");
                a.add("banana");
                a.add("cherry");
                a.add("mango");
                a.add("apple");
                System.out.println(a);
                a.remove(0);
                a.contains("orange");

        for(int i=0;i<a.size();i++){
            System.out.println("Index:"+i + "value:"+a.get(i));
        }



    }
}
