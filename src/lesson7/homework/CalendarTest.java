package lesson7.homework;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-30 20:01
 * @Description:
 */
public class CalendarTest {
    public static void main(String[] args) {
        DynamicCalendar dynamicCalendar = new DynamicCalendar();
        System.out.println(dynamicCalendar.calculateDays(2022, 7));
        dynamicCalendar.printCalendar(2022, 7);


//        System.out.println(dynamicCalendar.calculateDays(2022, 6));
    }
}