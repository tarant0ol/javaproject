package pr11.T1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class T1 {
    public static void main(String[] args) {
        Date current_date = new Date();
        Long task_time = 1728653913067L;
        Date task_date = new Date(task_time);
        SimpleDateFormat dateFormatter = new SimpleDateFormat("y.M.d HH:mm:ss");

        System.out.println("Время выдачи задания:\t" + dateFormatter.format(task_date) + "\tРазработчик: Соснин Артём");
        System.out.println("Время сдачи задания:\t" + dateFormatter.format(current_date));
    }
}