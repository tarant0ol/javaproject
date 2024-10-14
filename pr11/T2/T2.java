package pr11.T2;

import java.util.Date;
import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Date current_date = new Date();
        Long current_date_time = current_date.getTime();


        Date date = get_date_time();
        Long input_date_time = date.getTime();
        Long difference = current_date_time - input_date_time;

        System.out.println("Разница во времеин в милисекундах:" + difference);
        System.out.println("Разница во времеин в cекундах:" + difference / 1000);
        System.out.println("Разница во времеин в минутах:" + difference / (1000 * 60));
        System.out.println("Разница во времеин в часах:" + difference / (1000 * 3600));
        System.out.println("Разница во времеин в днях:" + difference / (1000 * 3600 * 24));
        difference = difference / 3600000;
        System.out.println("Разница во времеин в годах" + difference / (24 * 365));

    }

    public static Date get_date_time(){
        Scanner sc = new Scanner(System.in);
        System.out.println("date format: y M d H m");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        Date date = new Date(year-1900, month-1, day, hour, minute);
        return date;
    }
}