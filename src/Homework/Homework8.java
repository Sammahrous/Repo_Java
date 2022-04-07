package Homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Homework8 {
    public static void main(String[] args) {
        Date currentDate = null;
        Calendar cal = Calendar.getInstance();
        currentDate = cal.getTime();
        System.out.println("\nCurrent Date : " + currentDate + "\n");

        Calendar calFormat = Calendar.getInstance();
        SimpleDateFormat myFormat = new SimpleDateFormat("ha");
        System.out.print("Two Hours Interval : " + "Now ");
        for (int i = 0; i <= 3 ; i++){
            calFormat.add(Calendar.HOUR, 2);
            Date dateFormat = calFormat.getTime();
            System.out.print(myFormat.format(dateFormat).toLowerCase() + " ");
        }
            System.out.println("\n");

        Calendar calFormat1 = Calendar.getInstance();
        SimpleDateFormat myFormat1 = new SimpleDateFormat("ha");
        System.out.print("Two Hours Interval : " + "Now ");
        for (int i = 0; i < 1 ; i++){
            calFormat1.add(Calendar.HOUR, 2);
            Date dateFormat = calFormat1.getTime();
            System.out.print(myFormat1.format(dateFormat).toLowerCase() + " ");
        }
            System.out.println("\n");


        String timeString = "4:30";
        Date newTime = null;
        SimpleDateFormat makeTime = new SimpleDateFormat("h:ss a");
        try {
            newTime = makeTime.parse(timeString);
        }catch (ParseException e){
            e.printStackTrace();
        }
        System.out.println(newTime);
    }
}
    // could not figure out the last two tasks.