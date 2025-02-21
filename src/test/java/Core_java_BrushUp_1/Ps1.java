package Core_java_BrushUp_1;

import org.testng.annotations.Test;

public class Ps1 extends Ps {

    @Test
    public void testRun(){
        PS2 ps2 = new PS2(3);

        int a=3;
        dothis(); // parent class
        System.out.println(ps2.increment());
        System.out.println(ps2.Decrement());

        System.out.println(ps2.MultiplyThree());




    }


}
