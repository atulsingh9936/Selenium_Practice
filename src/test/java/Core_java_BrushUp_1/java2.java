package Core_java_BrushUp_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class java2 {
    public static void main(String[] args) {
        int [] arr2 ={2,15,9,4,5,45,34,89,78};
        for (int i=0;i<arr2.length;i++){
            if(arr2[i]%2==0){
                System.out.println(arr2[i]);
                break;

            }else{
                System.out.println(arr2[i]+" is not an multiple of 2");
            }
        }

        ArrayList<String> a = new ArrayList<String>();
        a.add("Atul");
        a.add("Akash");
        a.add("vivek");
        a.add("vikash");
        System.out.println( a.get(2));
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
        System.out.println("-------");
        for(String val:a){
            System.out.println(val);
        }

        // item present in the array list
        System.out.println( a.contains("vikash"));

        String[] names ={"atul","akash","anurag","dk"};
      List <String>nameArraylist = Arrays.asList(names);
        System.out.println(nameArraylist.contains("dk"));





    }
}
