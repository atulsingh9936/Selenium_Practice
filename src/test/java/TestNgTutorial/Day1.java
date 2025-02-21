package TestNgTutorial;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {
    @AfterTest
    public void lastexecution(){
        System.out.println("I will execute at last");

    }
    @AfterSuite
    public void afsuite(){
        System.out.println(" i  am no 1 from last");

    }

    @Test
    public void demo(){
        System.out.println("atul");
        Assert.assertTrue(false);
    }

    @Test
    public  void test2(){
        System.out.println("bye");
    }
}
