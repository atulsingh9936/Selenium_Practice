package Core_java_BrushUp_1;

public class Java1 {
    public static void main(String[] args) {

        int num =5;
        String website ="www.rahulshetty.com";
        char letter ='s';
        double dec = 5.99;
        boolean mycard = true;
        System.out.println(num + " is the value stored in mynum variable");
        System.out.println(website);

        // Arrays
        int [] arr =new int[5];
        arr[0]=1;
        arr[1]=15;
        arr[2]=9;
        arr[3]=0;
        arr[4]=5;

        int [] arr2 ={1,15,9,0,5,45,34,89,78};
        System.out.println(arr2[2]);
        System.out.println("----------------");
        // for loop
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("----------------");

        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }

        String[] names ={"atul","akash","anurag","dk"};
        for(int i=0;i< names.length;i++){
            System.out.println(names[i]);

        }
        System.out.println("----------------");
        for(String s:names){
            System.out.println(s);
        }

    }
}
