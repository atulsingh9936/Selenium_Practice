package Core_java_2.Collection_Framework;

import java.util.ArrayList;

public class Collectiondemo {
    public static void main(String[] args) {
        int a[] ={4,5,5,5,4,6,6,9,4};
        // 4 -3
        //5 - 3
        // 6 -2
        //9 -1
        ArrayList<Integer> a1 = new ArrayList<Integer>();

        for(int i=0;i<a.length;i++){
            int k =0;
            if(!a1.contains(a[i])){
                a1.add(a[i]);
                k++;
                for(int j =i+1;j<a.length;j++){
                    if(a[i]==a[j]){
                        k++;

                    }
                }
//                System.out.println(a[i]);
//                System.out.println(k);
                if (k==1){
                    System.out.println(a[i]+" is a unique number");
                }
            }

        }
        }
    }
