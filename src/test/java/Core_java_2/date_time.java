package Core_java_2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date_time {
    public static void main(String[] args) {
        Date d = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        System.out.println(sdf.format(d));
        System.out.println(sd.format(d));

        System.out.println(d.toString());
    }
}
