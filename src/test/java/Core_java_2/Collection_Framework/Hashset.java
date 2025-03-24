package Core_java_2.Collection_Framework;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {

        HashSet hs = new HashSet<>();
        hs.add("USA");
        hs.add("Uk");
        hs.add("India");

        hs.add("he");
        hs.add("she");

        hs.add("India");

      //  System.out.println(hs);
       // System.out.println(hs.remove("Uk"));
        //System.out.println(hs.isEmpty());
      //  System.out.println(hs.size());

        //Iterator
      Iterator<String> i = hs.iterator();
      while(i.hasNext()){
          System.out.println(i.next());
      }



    }
}
