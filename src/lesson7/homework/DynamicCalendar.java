package lesson7.homework;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-30 17:09
 * @Description:
 */
public class DynamicCalendar {

    // 判断年份是否为闰年
    public boolean isALeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    // 输入一个年份和月份判断这个年份和月份,输出月份有多少天
    public int monthDays(int year, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                if (isALeapYear(year)) {
                    return 29;
                }
                return 28;
            default:
                return 30;
        }
    }

    // 	计算从1900年1月1日到year年month月之间的总天数,不包含当前的年份和月份
    public int calculateDays(int year, int month) {
        int total = 0;
        for (int i = 1900; i < year; i++) {
            if (isALeapYear(year)) {
                total += 366;
            } else {
                total += 365;
            }
        }
        for (int i = 1; i < month; i++) {
            total += monthDays(year, i);
        }
        return total;
    }

    // 	打印日历, 先算数每个月前面的空格数，每周七天，每七天换一行
    public int printCalendar(int year, int month) {
        System.out.println("一\t二\t三\t四\t五\t六\t日\n");
        int date = calculateDays(year, month);
        for (int j = 1; j < (date + 1) % 7; j++) {
            System.out.print("\t");
        }
        for (int i = 1; i <=  monthDays(year, month); i++) {
            int week = (i + date) % 7;

            System.out.print(i + "\t");
            if (week == 0) {
                System.out.println();
            }
        }
        return 0;
    }


}