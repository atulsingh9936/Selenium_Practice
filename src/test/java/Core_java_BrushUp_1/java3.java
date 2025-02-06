package Core_java_BrushUp_1;

public class java3 {
    public static void main(String[] args) {
        //String s ="Rahul shetty Academy";
       // String s1 ="Rahul shetty Academy";

        String s2 = new String("Welcome");
        String s3 = new String("Welcome");

        String s ="Rahul shetty Academy";
      String[] splittedstring=  s.split("shetty");
        System.out.println(splittedstring[0]);
        System.out.println(splittedstring[1]);
        splittedstring[1].trim();
        System.out.println(splittedstring[1].trim());
//        for(int i=0;i<s.length();i++){
//            System.out.println(s.charAt(i));
//        }

        for(int i=s.length()-1;i>=0;i--){
            System.out.println(s.charAt(i));
        }


    }
}
