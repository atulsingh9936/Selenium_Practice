package TestNgTutorial;

import org.testng.annotations.*;

public class Day3 {
    @BeforeClass
    public void Beforeclass(){
        System.out.println("before executing any method in the class");

    }
    @Parameters({"Url","APIKEY/USERNAME"})
    @Test
    public void WEbloginCar(String urlname,String key){
        System.out.println("weblogincar");
        System.out.println(urlname);
        System.out.println(key);
        // selenium


    }
    @Test(groups = {"Smoke"})
    public void mobileloginCar(){
        System.out.println("mobilelogincar");
        //Appium

    }
    @BeforeMethod
    public void beforeEvery(){
        System.out.println(" i will run  before every method in day 3 class ");
    }

    @AfterMethod
    public void afterEvery(){
        System.out.println(" i will run  after every method in day 3 class ");
    }

    @BeforeSuite
    public void Bfsuite(){
        System.out.println("I am no 1");
    }
    @Test(enabled = false)
    public void mobilesigninCar(){
        System.out.println("mobilesignincar");
        //Appium

    }
   // @Test(timeOut = 4000)
    @Test(dataProvider = "getdata")
    public void mobilesignoutCar(String username, String password){
        System.out.println("mobilesignoutcar");
        System.out.println(username);
        System.out.println(password);
        //Appium

    }

    @AfterClass
    public void Afterclass(){
        System.out.println("After executing every(all) method i will execute");

    }
    @Test(dependsOnMethods = {"WEbloginCar","mobileloginCar"})
    public void APICarLoan(){

        System.out.println("apicarloan");

        // Rest Api automation

    }

    @DataProvider
    public Object[][] getdata(){

        // 1 st combination- username and password = good credit history
        // 2 nd combination- username and password == no credit history
        // 3 rd - fraudulent credit history

        Object[][] data = new Object[3][2];
        // 1 set
        data[0][0]="firstsetusername";
        data[0][1]="password1";
        // columns in the row are nothing but values for that particular combination(row)

        // 2nd set
        data[1][0]="seccondsetusername";
        data[1][1]="password2";

        // 3nd set
        data[2][0]="Thirdsetusername";
        data[2][1]="password3";
        return data;






    }
}
