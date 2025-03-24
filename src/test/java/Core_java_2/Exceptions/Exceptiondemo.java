package Core_java_2.Exceptions;

public class Exceptiondemo {

    // one try can be followed with multiple catch blocks
    // catch should be an immediate block after try

    int a =4;
    public static void main(String[] args) {

        int b = 7;
        int c = 0;
        try {
          int k = b/c;
           // int arr[]= new int[5];


           // System.out.println(arr[7]);
            System.out.println(k);

        }

        catch (ArithmeticException et){
            System.out.println(" i catched arthimetic exception");
        }

        catch (IndexOutOfBoundsException ets){
            System.out.println(" i catched Index bound exception");

        }
        catch (Exception e) {
            System.out.println(" i catched the exception");
        }

        finally {
            System.out.println("delete cookies");
            // this block is executed irrespective of exception thrown or not
        }

    }


    }

