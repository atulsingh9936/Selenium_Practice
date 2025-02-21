package TestNgTutorial;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
    @Parameters({"Url"})
    @Test
    public void WEbloginHomeLoan(String uname){
        System.out.println("webloginHomePersonalLoan");
        System.out.println(uname);
        // selenium


    }
    @Test(groups = {"Smoke"})
    public void mobileloginHome(){
        System.out.println("mobileloginHome");
        //Appium

    }
    @Test
    public void LoginApiHome(){

        System.out.println("restassuredHome");

        // Rest Api automation

    }
}
