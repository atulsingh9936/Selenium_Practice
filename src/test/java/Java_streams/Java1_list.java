package Java_streams;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java1_list {
    // @Test
    public static void regular() {
        // count the no. of names starting with alphabet A in list
        List<String> names = new ArrayList<String>();
        names.add("Abhijeet");
        names.add("Don");
        names.add("Alkheya");
        names.add("Adam");
        names.add("Ram");
        int count = 0;
        for (int i = 0; i < names.size(); i++) {

            String actual = names.get(i);
            if (actual.startsWith("A")) {
                count++;
            }

        }
        System.out.println(count);

    }

 //   @Test
    public void streamfilter() {

        List<String> names = new ArrayList<String>();
        names.add("Abhijeet");
        names.add("Don");
        names.add("Alkheya");
        names.add("Adam");
        names.add("Ram");
        // there is no life for intermediate operation, if there is no terminal operation
        //terminal operation will execute only if intermediate operation(filter) returns true
        // we can create stream  with stream package
        // how to use stream filter in stream API
        Long c = names.stream().filter(s -> s.startsWith("A")).count();
        System.out.println(c);
        Long d = Stream.of("Abhijeet", "Don", "Alkheya", "Adam", "Ram").filter(s ->
        {
            s.startsWith("A");
            return true;
        }).count();
        System.out.println(d);
        // print all the names of arraylist
        // names.stream().filter(s->s.length()>4).forEach(s-> System.out.println(s));
        names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));

    }


 //   @Test
    public void StreamMap() {

        List<String> names = new ArrayList<String>();
        names.add("man");
        names.add("Don");
        names.add("Women");



        // print the names of last letter as "a" with upper case
      Stream.of("Abhijeet", "Don", "Alkheya", "Adam", "Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
              .forEach(s-> System.out.println(s));

        // Print names which have first letter as a with uppercase and sorted
     List<String> names1=   Arrays.asList("Azhijeet", "Don", "Alkheya", "Adam", "Rama");
     names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s-> System.out.println(s));
      // merging two different list
     Stream<String> newStream =Stream.concat(names.stream(),names1.stream());
     newStream.sorted().forEach(s-> System.out.println(s));

      boolean flag=  newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
        System.out.println(flag);
        Assert.assertTrue(flag);
    }

    @Test

    public void streamCollect(){
     List<String> ls=   Stream.of("Abhijeet", "Don", "Alkheya", "Adam", "Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(ls.get(0));

         // print unique number of array
        // sort the array and give 3 rd index -1,2,3,4,5,7,8,9
        List<Integer> values=Arrays.asList(3,2,4,2,5,7,8,1,9,7);
       // values.stream().distinct().forEach(s-> System.out.println(s));
      List<Integer> li=  values.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(li.get(2));

    }
}