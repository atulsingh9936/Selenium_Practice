package TestNgTutorial;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
    @Test(groups = {"Smoke"})
    public void test2() {
        System.out.println("test2");
    }
        @BeforeTest
        public void prerequisite(){
            System.out.println("I will execute first");

    }
}
