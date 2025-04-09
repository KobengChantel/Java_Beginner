package chapter11.Lesson11;
import java.util.ArrayList;
import java.time.*;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.format.FormatStyle;

public class Lesson11 {
    public static void main(String[] args) {

        LocalDate myDate = LocalDate.now();
        System.out.println("Today's date is " + myDate);

        LocalDate newDate = myDate.minusMonths(10);
        System.out.println("Today's date is " + newDate);

        JapaneseDate jDate = JapaneseDate.from(myDate);
        System.out.println("Today's date in japan is " + jDate);

        LocalDate today = LocalDate.now();
        System.out.println("Today's date(without formatting) is " + today);

        String sdate = today.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("Today's date (in ISO_DATE_TIME format) is " + sdate);

    String fdate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("Today's date (in Medium Localized format) is " + fdate);

        int[][] yearlySales;
        yearlySales = new int[5][4];
        yearlySales[0][0] = 1000;
        yearlySales[0][1] = 1500;
        yearlySales[0][2] = 1800;
        yearlySales[1][0] = 1000;
        yearlySales[3][3] = 2000;

//      //****************
        System.out.println();
        int counter =  0;
        while(counter < 3) {


    }
}

        //***********NESTED WHILE LOOP**********
        String name = "Lenny";
        String guess = " ";
        int attempts = 0;
        while(!guess.equalsIgnoreCase(name)){
        char ascliChar = (char) (Math.random() * 26 +97);
        guess+= ascliChar;
        }
        attempts++;
        }
        System.pout.println(name + " found after " + attempts + "