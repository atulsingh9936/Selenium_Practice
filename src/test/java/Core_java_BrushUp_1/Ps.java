package Core_java_BrushUp_1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Ps {

        // methods and variable

    public  void dothis(){
        System.out.println("i am here");
    }

    @BeforeMethod
    public void BeforeRun(){
        System.out.println("Run me first");
    }

    @AfterMethod
    public void AfterRun(){
        System.out.println("Run me last");
    }








}
