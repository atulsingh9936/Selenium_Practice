package Core_Java.Arrays;

public class Arrays {
    public static void main(String[] args) {

       // int a =4;
        // if i want to store mutiple values in single container then we use array

        int a[]= new int [5]; // declares an array and allocates memory for the values
       // int b[] = new int [10];
        a[0]=2;
        a[1]=9;
        a[2]=8;
        a[3]=5;
        a[4]=12;

        int b[] ={1,2,3,5,67};


        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }


    }
}
