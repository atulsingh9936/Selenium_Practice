package Core_Java.Arrays;

public class Multidimensional_arrays {
    public static void main(String[] args) {
        int a[][]=new int[2][3];
        a[0][0]=2;
        a[0][1]=4;
        a[0][2]=5;

        a[1][0]=3;
        a[1][1]=4;
        a[1][2]=7;

//        int b[][]={{2,4,5},{3,4,7},{5,2,1}};
//        System.out.println(b[2][1]);

     //   System.out.println(a[1][0]);


        for(int i=0;i<2;i++){

            for(int j=0;j<3;j++){
                System.out.println(a[i][j]);
            }
        }



    }
}
